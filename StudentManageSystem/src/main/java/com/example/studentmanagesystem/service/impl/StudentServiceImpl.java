package com.example.studentmanagesystem.service.impl;

import com.example.studentmanagesystem.entity.Student;
import com.example.studentmanagesystem.reponsitory.StudentReponsitory;
import com.example.studentmanagesystem.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentReponsitory studentReponsitory;
    //ghi đè phương thức interface lấy tất cả student và trả về 1 list student thông qua findAll trong repon
    @Override
    public List<Student> getAllStudents(){
        return studentReponsitory.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentReponsitory.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentReponsitory.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentReponsitory.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentReponsitory.deleteById(id);
    }

}
