package by.gvu.jd2.service;

import by.gvu.jd2.bean.err.ServiceException;
import by.gvu.jd2.mysql.FactoryCommand;
import by.gvu.jd2.service.command.ErrorCommand;
import by.gvu.jd2.service.command.base.Command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Command doAction = FactoryCommand.getCommand(req.getParameter("command"));

        try{
            if (doAction.execute(req, resp)) {
                doAction.forwardSuccess(req, resp);
            } else {
                doAction.forwardError(req, resp);
            }
        } catch (ServiceException e){
            e.printStackTrace();
            try {
                doAction.forwardError(req, resp);
            } catch (ServiceException serviceException) {
                serviceException.printStackTrace();
            }
        }
    }
}
