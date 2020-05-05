package by.gvu.jd2.dao.base;

import by.gvu.jd2.bean.Attribute;
import by.gvu.jd2.bean.err.DaoException;

public interface GroupAttributes {
    by.gvu.jd2.bean.GroupAttributes getGroupAttributes(int groupId) throws DaoException;
    boolean addAttributeToGroup(int groupId, Attribute attribute) throws DaoException;
    boolean deleteAttributeFromGroup(int groupId, int attributeId) throws DaoException;
    boolean addGroup(by.gvu.jd2.bean.GroupAttributes groupAttributes) throws DaoException;
    boolean deleteGroup(int groupId) throws DaoException;
    boolean setCatalogToGroup(int groupId, int catalogId) throws DaoException;
}
