package by.gvu.jd2.dao.base;

import by.gvu.jd2.bean.Order;
import by.gvu.jd2.bean.UserForm;

import java.util.List;

public interface Orders {
    public List<Order> getOrders(UserForm user);
    boolean clearOrder(UserForm user);
}
