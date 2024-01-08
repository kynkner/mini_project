package com.techmaster.mini_project.dao;

import com.techmaster.mini_project.data.ProductData;
import com.techmaster.mini_project.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
@Repository
public class ProductDao implements Productlmpl {
    @Override
    public List<Product> getALl() {
        return ProductData.productList.stream().toList();
    }

    @Override
    public Product getProduct(int id) {
        return ProductData.productList.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Product> getProductBY(String name) {
        return ProductData.productList.stream().filter(s -> s.getName().equals(name)).collect(Collectors.toList());
    }
}
