package com.example.studentmanagesystem;

import com.example.studentmanagesystem.entity.Student;
import com.example.studentmanagesystem.reponsitory.StudentReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManageSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManageSystemApplication.class, args);
    }

    @Autowired
    private StudentReponsitory studentReponsitory;
    @Override
    public void run(String... args) throws Exception {
//        Student student1=new Student("Tuan Anh","Nguyen Hoang","hoangtuanhanh@gmail.com");
//        studentReponsitory.save(student1);
//
//        Student student2=new Student("Phong Nam","Nguyen Hoang","namvu@gmail.com");
//        studentReponsitory.save(student2);
//
//        Student student3=new Student("Tony","Nguyen","tony@gmail.com");
//        studentReponsitory.save(student3);
    }
}
