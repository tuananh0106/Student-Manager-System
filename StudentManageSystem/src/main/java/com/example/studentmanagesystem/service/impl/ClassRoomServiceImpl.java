package com.example.studentmanagesystem.service.impl;

import com.example.studentmanagesystem.entity.Classroom;
import com.example.studentmanagesystem.reponsitory.ClassRoomRepository;
import com.example.studentmanagesystem.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomServiceImpl implements ClassRoomService {
    @Autowired
    private ClassRoomRepository classRoomRepository;


    @Override
    public List<Classroom> getAll() {
        return classRoomRepository.findAll();
    }
}
