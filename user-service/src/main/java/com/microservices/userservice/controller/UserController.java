package com.microservices.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/user")
class UserController {
        @GetMapping
        public String getUsers() {
            return "User list from USER-SERVICE";
        }
    }


