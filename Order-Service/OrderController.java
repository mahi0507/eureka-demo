package com.example.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public String getOrder(@PathVariable int id) {
        String productResponse = restTemplate.getForObject("http://product-service/products/" + id, String.class);
        return "Order created for: " + productResponse;
    }
}