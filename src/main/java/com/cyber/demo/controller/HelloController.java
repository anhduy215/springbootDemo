package com.cyber.demo.controller;

import com.cyber.demo.payload.request.LoginReq;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @controller trả về html
 * @ResponseBody trả về string viết api
 * @restController kết hợp 2 thg trên
 * form-data cho phép truyền file
 * form urlencoded không file
 * raw truyền đối tượng(dùng nhiều nhất)
 */

@RestController
@RequestMapping("/hello")
public class HelloController {
    /**
     * trình duyệt @RequestParam
     * truyền ngầm
     * đường dẫn @PathVariable
     * đối tượng @ResquestBody
     * @return
     */
    @GetMapping("")
    public String hello(@RequestParam String hoten,@RequestParam int tuoi){
        return "hello quơ"+hoten+tuoi;
    }
    @PostMapping("/cyber")
    public String hellocyber(@RequestBody LoginReq login){
        return "hello quơ cyber" + login.getUsername();
    }

    //tra ve response entity
    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@PathVariable int id){
        return new ResponseEntity<>("update"+id, HttpStatus.OK);
    }
}
