package com.springdemo.demo;

import com.springdemo.demo.bean.Student;
import com.springdemo.demo.bean.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MockConfiguration {

    @Bean
    public Student mockStudent() {
        return new Student();
    }

    @Bean
    public Teacher mockTeacher() {
        return new Teacher();
    }
}
