package com.projeto.java.apidemo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.java.apidemo.entities.Department;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {
    
    @GetMapping
    public List<Department> GetObjects() {
        //create the departments instantiating two new objects with the parameters
        Department d1 = new Department(1L,"Tech");
        Department d2 = new Department(2L,"Pet");
        List<Department> departmentList = Arrays.asList(d1,d2);
        return departmentList;
    }
}
