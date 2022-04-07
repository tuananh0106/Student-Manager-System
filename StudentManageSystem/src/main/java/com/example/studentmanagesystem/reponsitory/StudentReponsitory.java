package com.example.studentmanagesystem.reponsitory;

import com.example.studentmanagesystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


//không cần @reponsitory bởi vì đã thực hiện extends đối với lớp interface này rồi nên không cần thực hiện nữa
//như ở dưới thì chúng ta sẽ hiểu là cái lớp jpaReponsitory này cần 1 entity là Student
// cần 1 cái entity và 1 Id của lớp đó để thực hiện xác định những câu truy vấn của spring boot data
public interface StudentReponsitory extends JpaRepository<Student,Long> {
//có phương thức findAll trong reponsitory
}
