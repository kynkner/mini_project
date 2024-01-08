package com.techmaster.mini_project.service;

import com.techmaster.mini_project.dao.Productlmpl;
import com.techmaster.mini_project.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private Productlmpl productlmpl;

    public List<Product> getAll(){
        return productlmpl.getALl();
    }
    public Product getProduct(int id){
        return productlmpl.getProduct(id);
    }
    public List<Product> getProductBY (String name){
        return productlmpl.getProductBY(name);
    }
}
