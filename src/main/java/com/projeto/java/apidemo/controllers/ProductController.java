package com.projeto.java.apidemo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.java.apidemo.entities.Department;
import com.projeto.java.apidemo.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    
    @GetMapping
    public List<Product> GetObjects() { //Create a list of products as a <List> array
        //create the departments instantiating two new objects with the parameters
        Department d1 = new Department(1L,"Tech");
        Department d2 = new Department(2L,"Pet");

        //Create the sample products
        Product p1 = new Product(1L, "Macbook Pro", 4000.0, d1);
        Product p2 = new Product(2L, "PC Gamer", 5000.0, d1);
        Product p3 = new Product(3L, "Pet House", 300.0, d2);

        //Use function Arrays.asList to build the list of products object and
        //retur the list
        List<Product> productList = Arrays.asList(p1,p2,p3);
        return productList;

        //Department d2 = new Department();

     }
}
