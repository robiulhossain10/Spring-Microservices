package com.microservices.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @GetMapping("/list")
    public String getMassage(){
        return "This is Product Controller";
    }
    @GetMapping("/data")
    public String getMassage2(){
        return "This is Product Controller Data";
    }
}
