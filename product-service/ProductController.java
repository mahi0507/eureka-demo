package com.example.productservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/{id}")
    public String getProduct(@PathVariable int id) {
        return "Product details for ID: " + id;
    }
}