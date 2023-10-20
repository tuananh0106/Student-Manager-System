package com.example.studentmanagesystem.service.impl;

import com.example.studentmanagesystem.entity.Student;
import com.example.studentmanagesystem.reponsitory.StudentRepository;
import com.example.studentmanagesystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        System.out.println("tanh trước save" + student);
//        System.out.println("tanh trước save" + studentRepository.save(student));
        studentRepository.save(student);
        System.out.println("tanh sau save" + student);
        return student;
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

}
