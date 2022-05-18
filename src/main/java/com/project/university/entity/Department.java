package com.project.university.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Department {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_en")
    private String nameEn;

    @Column(name = "name_bn")
    private String nameBn;

    @Column(name = "code")
    private String code;

    @Column(name = "updatedAt")
    private String updatedAt;

    @Column(name = "entry_date")
    private String entryDate;
}
