package com.appsdeveloperblog.photoapp.photoapp.api.users.PhotoAppApiUsers.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/status/check")
    public String checkStatus() {
        return "Working properly";
    }
    
}