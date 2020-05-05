package by.gvu.jd2.dao.base;

import by.gvu.jd2.bean.*;

import java.util.List;

public interface Products {
    List<Product> getProducts(GroupAttributes groupAttributes);
    Product getProductInfo(int productId);
    boolean addProduct(Product product);
    boolean deleteProduct(CatalogInfo catalog, Product productId);
    boolean addAttributeToProduct(CatalogInfo catalog, Product product, Attribute attribute);
    boolean deleteAttributeFromProduct(CatalogInfo catalog, Product product, Attribute attribute);
    boolean addProductToOrder(Product product, UserForm user);
}
