package com.project.university.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_type")
public class userType {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "massage")
    private String massage;

    @Column(name = "active_status")
    private Boolean active_status;
}
