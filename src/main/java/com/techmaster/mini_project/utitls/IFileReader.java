package com.techmaster.mini_project.utitls;

import com.techmaster.mini_project.model.Product;

import java.util.List;

public interface IFileReader {
        List<Product> readFile(String name);
}
