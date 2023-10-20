package com.example.studentmanagesystem.reponsitory;

import com.example.studentmanagesystem.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomRepository extends JpaRepository<Classroom, Long> {
}
