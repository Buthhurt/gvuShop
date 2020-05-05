package by.gvu.jd2.service;

import by.gvu.jd2.bean.err.ServiceException;
import by.gvu.jd2.service.base.Command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ErrorCommand implements Command {
    @Override
    public boolean execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        return true;
    }

    @Override
    public void forwardSuccess(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        try {
            request.getRequestDispatcher("/ErrorPage").forward(request, response);
        } catch (ServletException | IOException e){
            e.printStackTrace();
            throw new ServiceException("Вообще фигня какая-то случилась. Не смогли пойти на другую страницу", e);
        }
    }

    @Override
    public void forwardError(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        try {
            request.getRequestDispatcher("/ErrorPage").forward(request, response);
        } catch (ServletException | IOException e){
            e.printStackTrace();
            throw new ServiceException("Вообще фигня какая-то случилась. Не смогли пойти на другую страницу", e);
        }
    }
}
