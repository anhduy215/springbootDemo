package com.cyber.demo.controller;

import com.cyber.demo.Entity.Student;
import com.cyber.demo.Entity.UsersEntity;
import com.cyber.demo.payload.request.LoginReq;
import com.cyber.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @controller trả về html
 * @ResponseBody trả về string viết api
 * @restController kết hợp 2 thg trên
 * @Bean,@Service,@Component,@Repository(IOC container dùng chung) tạo 1 class gán sẵn giá trị và sử dụng lại tương tự như static(lưu thẳng vào ram)
 *
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
    @Autowired
    private Student student;
    @Autowired
    private UserRepository userRepository;
    @GetMapping("")
    public String hello(@RequestParam String hoten,@RequestParam int tuoi){
        return "hello quơ"+hoten+tuoi+"IOC"+student.getName();
    }
    //bắt dau từ đây là api có kết nối với db MySQL
    @GetMapping("/demoJPA")
    public ResponseEntity<?> demoJPA(){
        List<UsersEntity> list = userRepository.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
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
