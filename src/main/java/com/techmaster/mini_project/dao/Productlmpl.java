package com.techmaster.mini_project.dao;

import com.techmaster.mini_project.model.Product;

import java.util.List;

public interface Productlmpl {
    List<Product> getALl();
    Product getProduct(int id);
    List<Product> getProductBY(String name);
}
