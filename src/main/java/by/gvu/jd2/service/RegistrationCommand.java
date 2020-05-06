package by.gvu.jd2.service;

import by.gvu.jd2.bean.Role;
import by.gvu.jd2.bean.User;
import by.gvu.jd2.bean.UserForm;
import by.gvu.jd2.bean.UserToken;
import by.gvu.jd2.bean.err.DaoException;
import by.gvu.jd2.bean.err.ServiceException;
import by.gvu.jd2.mysql.FactoryMySql;
import by.gvu.jd2.dao.base.Users;
import by.gvu.jd2.service.base.Command;
import org.apache.commons.codec.digest.DigestUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

public class RegistrationCommand implements Command {
    @Override
    public boolean execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        UserForm userForm = new UserForm();
        User user = new User();

        if (request.getParameter("login")==null || request.getParameter("login").length()<4 || request.getParameter("login").length()>16)
            userForm.setLogin(request.getParameter("login")==null?"":request.getParameter("login"));

        if (request.getParameter("password")==null || request.getParameter("password").length()<4 || request.getParameter("password").length()>16)
            userForm.setPassword(request.getParameter("password")==null?"":request.getParameter("password"));

        if (request.getParameter("passwordConfirm")==null || request.getParameter("passwordConfirm").length()<4 || request.getParameter("passwordConfirm").length()>16)
            userForm.setPasswordConfirm(request.getParameter("passwordConfirm")==null?"":request.getParameter("passwordConfirm"));

        if (!request.getParameter("password").equals(request.getParameter("passwordConfirm"))){
            if (userForm.getPassword()==null)
                userForm.setPassword(request.getParameter("password")==null?"":request.getParameter("password"));

            if (userForm.getPasswordConfirm()==null)
                userForm.setPasswordConfirm(request.getParameter("passwordConfirm")==null?"":request.getParameter("passwordConfirm"));
        }

        if (request.getParameter("email")==null || request.getParameter("email").length()<6 || request.getParameter("email").length()>30)
            userForm.setEmail(request.getParameter("email")==null?"":request.getParameter("email"));

        if (request.getParameter("fname")==null || request.getParameter("fname").length()<2 || request.getParameter("fname").length()>30)
            userForm.setfName(request.getParameter("fname")==null?"":request.getParameter("fname"));

        if (request.getParameter("sname")==null || request.getParameter("sname").length()<2 || request.getParameter("sname").length()>30)
            userForm.setsName(request.getParameter("sname")==null?"":request.getParameter("sname"));

        if (request.getParameter("nname")==null || request.getParameter("nname").length()<4 || request.getParameter("nname").length()>16)
            userForm.setnName(request.getParameter("nname")==null?"":request.getParameter("nname"));

        /**
         * Заглушка. Временно регестрируем только один пол.
         * sexId=1
         */

        /**
         * Заглушка. Все пользователи рождаются в день регистрации
         * birthday=Date().now()
         */

        if (userForm.isSet()) {
            UserForm userFormValues = new UserForm();
            userFormValues.setLogin(request.getParameter("login"));
            userFormValues.setPassword(request.getParameter("password"));
            userFormValues.setPasswordConfirm(request.getParameter("passwordConfirm"));
            userFormValues.setEmail(request.getParameter("email"));
            userFormValues.setfName(request.getParameter("fname"));
            userFormValues.setsName(request.getParameter("sname"));
            userFormValues.setnName(request.getParameter("nname"));

            request.setAttribute("RegistrationFormError", userForm);
            request.setAttribute("RegistrationForm", userFormValues);

            throw new ServiceException("Ошибка заполнения регистрационной формы");
        }

        user.setLogin(request.getParameter("login"));
        user.setPsw_md5(DigestUtils.md5Hex(request.getParameter("password")));
        user.setPsw_sha3(DigestUtils.sha3_224Hex(request.getParameter("password")));
        user.setEmail(request.getParameter("email"));
        user.setRole(new Role(1));
        user.setfName(request.getParameter("fname"));
        user.setsName(request.getParameter("sname"));
        user.setnName(request.getParameter("nname"));
        user.setSexId(1);
        user.setBirthday(new Timestamp(System.currentTimeMillis()));

        boolean result = false;

        try {
            Users users = FactoryMySql.getInstance().getUsersImpl();
            result = users.registerUser(user);

            if (result){
                User templUser = new User();
                templUser.setLogin(user.getLogin());

                List<User> templList =  users.findUsers(templUser);
                if (templList.size()==1){
                    UserToken userToken = new UserToken();
                    userToken.setId(templList.get(0).getId());
                    userToken.setnName(templList.get(0).getnName());
                    request.setAttribute("USERTOKEN", userToken);
                } else {
                    throw new ServiceException("Ошибка при регистрации пользователя. В базе какая-то путаница с пользователями.");
                }
            }
        } catch (DaoException e) {
            e.printStackTrace();
            throw new ServiceException(e.getMessage());
        }

        return result;
    }

    @Override
    public void forwardSuccess(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        try {
            request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
        } catch (ServletException | IOException e){
            e.printStackTrace();
            throw new ServiceException("Вообще фигня какая-то случилась. Не смогли пойти на другую страницу", e);
        }
    }

    @Override
    public void forwardError(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        try {
            request.getRequestDispatcher("Registration").forward(request, response);
        } catch (ServletException | IOException e){
            e.printStackTrace();
            throw new ServiceException("Вообще фигня какая-то случилась. Не смогли пойти на другую страницу", e);
        }
    }
}