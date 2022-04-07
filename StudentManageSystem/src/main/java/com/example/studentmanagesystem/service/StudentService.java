package com.example.studentmanagesystem.service;

import com.example.studentmanagesystem.entity.Student;

import java.util.List;
//service được hiểu là nơi viết các hàm gọi dữ liệu từ database sang
public interface StudentService {
    List<Student> getAllStudents();//tạo ra 1 interface lấy 1 list danh sách student

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
