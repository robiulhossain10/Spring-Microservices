package com.microservices.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/order/delivary")
class deliveryController {
    @GetMapping
    public String getUsers() {
        return "User list from Delivery-SERVICE";
    }
}
