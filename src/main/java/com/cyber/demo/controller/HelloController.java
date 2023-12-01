package com.cyber.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @controller trả về html
 * @ResponseBody trả về string viết api
 * @restController kết hợp 2 thg trên
 */

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("")
    public String hello(){
        return "hello quơ";
    }
    @GetMapping("/cyber")
    public String hellocyber(){
        return "hello quơ cyber";
    }
}
