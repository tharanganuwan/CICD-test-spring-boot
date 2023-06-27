package com.demo2.demo2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/student")
public class TestController{
    
    @GetMapping("/getAll")
    public String getAllStudent(){
        return "Tharanga nuwan Kumara";
    }

}