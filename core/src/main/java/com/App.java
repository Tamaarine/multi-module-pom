package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        var student = new Student();
        student.setAddress("Address 1");
        System.out.println(student);
        SpringApplication.run(App.class);
    }
}
