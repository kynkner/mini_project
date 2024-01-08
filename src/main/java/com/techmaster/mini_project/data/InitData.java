package com.techmaster.mini_project.data;

import com.techmaster.mini_project.data.ProductData;
import com.techmaster.mini_project.model.Product;
import com.techmaster.mini_project.utitls.IFileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class InitData implements CommandLineRunner {
    private static final String productData = "D:\\Springboot-techmaster\\Bai_tap_Spring_Boot\\Bai_tai_java_Spring_boot\\Mini_project\\mini_project\\src\\main\\resources\\MOCK_DATA.json";
    @Autowired
    private IFileReader iFileReader;
    @Override
    public void run(String... args) {
        System.out.println("Du lieu");
        ProductData.productList = loadData();
        System.out.println("dddd");
        for (Product product : ProductData.productList){
            System.out.println(product);
        }
    }

    private List<Product> loadData() {
        return iFileReader.readFile(productData);
    }
}
