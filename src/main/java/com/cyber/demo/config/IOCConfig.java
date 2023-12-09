package com.cyber.demo.config;

import com.cyber.demo.Entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IOCConfig {

    @Bean
    public Student createStudentIOC(){
        Student student = new Student();
        student.setAge(22);
        student.setName("zuy");
        return student;
    }
}
