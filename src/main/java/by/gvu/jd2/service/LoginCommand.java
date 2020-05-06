package by.gvu.jd2.service;

import by.gvu.jd2.bean.Role;
import by.gvu.jd2.bean.User;
import by.gvu.jd2.bean.UserForm;
import by.gvu.jd2.bean.UserToken;
import by.gvu.jd2.bean.err.DaoException;
import by.gvu.jd2.bean.err.ServiceException;
import by.gvu.jd2.dao.base.Users;
import by.gvu.jd2.mysql.FactoryMySql;
import by.gvu.jd2.service.base.Command;
import org.apache.commons.codec.digest.DigestUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

public class LoginCommand implements Command {
    @Override
    public boolean execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        UserForm userForm = new UserForm();

        if (request.getParameter("login")==null || request.getParameter("login").length()<4 || request.getParameter("login").length()>16)
            userForm.setLogin(request.getParameter("login")==null?"":request.getParameter("login"));

        if (request.getParameter("password")==null || request.getParameter("password").length()<4 || request.getParameter("password").length()>16)
            userForm.setPassword(request.getParameter("password")==null?"":request.getParameter("password"));

        if (userForm.isSet()) {
            UserForm userFormValues = new UserForm();
            userFormValues.setLogin(request.getParameter("login"));
            userFormValues.setPassword(request.getParameter("password"));

            request.setAttribute("LoginFormError", userForm);
            request.setAttribute("LoginForm", userFormValues);

            throw new ServiceException("Ошибка заполнения формы авторизации");
        }

        UserToken result = null;

        try {
            Users users = FactoryMySql.getInstance().getUsersImpl();
            result = users.loginUser(request.getParameter("login"), request.getParameter("password"));

            request.setAttribute("USERTOKEN", result);
        } catch (DaoException e) {
            UserForm userFormValues = new UserForm();
            userFormValues.setLogin(request.getParameter("login"));
            userFormValues.setPassword(request.getParameter("password"));
            request.setAttribute("LoginForm", userFormValues);
            e.printStackTrace();
            throw new ServiceException(e.getMessage());
        }

        return true;
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
            request.getRequestDispatcher("Login").forward(request, response);
        } catch (ServletException | IOException e){
            e.printStackTrace();
            throw new ServiceException("Вообще фигня какая-то случилась. Не смогли пойти на другую страницу", e);
        }
    }
}