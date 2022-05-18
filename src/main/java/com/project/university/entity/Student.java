package com.project.university.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "roll_bsc")
    private String rollBsc;

    @Column(name = "roll_msc")
    private String rollMsc;

    @Column(name = "dept_id")
    private String deptId;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "nid_no")
    private String nidNo;

    @Column(name = "semester")
    private String semester;

    @Column(name = "birth_day")
    private String birthDay;

    @Column(name = "updatedAt")
    private String updated_at;

    @Column(name = "entry_date")
    private String entryDate;
}
