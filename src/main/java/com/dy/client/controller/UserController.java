package com.dy.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/index1")
    public Object index1() {
    	return "访问成功！";
    }
}