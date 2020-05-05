package by.gvu.jd2.dao.base;

import by.gvu.jd2.bean.Address;
import by.gvu.jd2.bean.PaymentMethod;
import by.gvu.jd2.bean.User;
import by.gvu.jd2.bean.UserForm;
import by.gvu.jd2.bean.err.DaoException;

import java.util.List;

public interface Users {
    boolean registerUser(User user) throws DaoException;
    UserForm loginUser(String userLogin, String userPassword) throws DaoException;
    UserForm loginUser(String userLogin, String userPassword, String sessionId) throws DaoException;
    boolean logoutUser(UserForm user) throws DaoException;
    User getUserInfo(UserForm user) throws DaoException;
    List<Address> getUserAddresses(UserForm user) throws DaoException;
    List<PaymentMethod> getUserPaymentMethods(UserForm user) throws DaoException;
    List<User> findUsers(User userFilter) throws DaoException;
}
