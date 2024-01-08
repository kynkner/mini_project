package com.techmaster.mini_project.controller;

import com.techmaster.mini_project.model.Product;
import com.techmaster.mini_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProcductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String getAllProduct(Model model, @RequestParam(required = false) String name){
        List<Product> productList = new ArrayList<>();
        if (name != null) {
            productList = productService.getProductBY(name);
        }
        if (productList == null || productList.isEmpty()){
            productList = productService.getAll();
        }
        model.addAttribute("productlist", productList);
        return "index";
    }
    @GetMapping("/products/{id}")
    public String getAllProduct(Model model, @PathVariable int id){
        model.addAttribute("product", productService.getProduct(id));
        return "product-id";
    }
}
