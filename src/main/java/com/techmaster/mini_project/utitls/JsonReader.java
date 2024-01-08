package com.techmaster.mini_project.utitls;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.techmaster.mini_project.model.Product;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
public class JsonReader implements IFileReader{

    @Override
    public List<Product> readFile(String name) {
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            return objectMapper.readValue(new File(name), new TypeReference<List<Product>>() {
            });
        }catch (IOException e){
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }
    }
}
