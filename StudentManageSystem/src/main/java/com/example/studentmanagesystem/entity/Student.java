package com.example.studentmanagesystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="students")
@Data
public class  Student {

    public Student() {
    }

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//muốn tạo ra chiến thuật tự tăng thực hiện
                                                        // GeneratedValue với strategy là chiến thuật
                                                        // và generation.identity là giá trị tăng lên 1 đơn vị
    private Long id;

    @Column(name="first_name",nullable = false) //muốn nói đển cột nào đó thực hiện sử dụng anotation column
                                                //để tên của cột đó ở name
                                                // xét giá trị đó là notnull trong db bằng nullable=false
    private String firstName;

    @Column(name="last_name",nullable = false)
    private String lastName;

    @Column(name="email",nullable = false)
    private String email;

}
