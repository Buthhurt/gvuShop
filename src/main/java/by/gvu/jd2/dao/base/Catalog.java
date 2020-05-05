package by.gvu.jd2.dao.base;

import by.gvu.jd2.bean.CatalogInfo;
import by.gvu.jd2.bean.err.DaoException;

public interface Catalog {
    CatalogInfo fillAllCatalog() throws DaoException;
    CatalogInfo getCatalogPath(CatalogInfo info) throws DaoException;
}
