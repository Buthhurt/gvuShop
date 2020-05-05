package by.gvu.jd2.service.base;

import by.gvu.jd2.bean.err.ServiceException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
    boolean execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException;
    void forwardSuccess(HttpServletRequest request, HttpServletResponse response) throws ServiceException;
    void forwardError(HttpServletRequest request, HttpServletResponse response) throws ServiceException;
}
