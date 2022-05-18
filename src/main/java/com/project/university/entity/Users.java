package com.project.university.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "object_id")
    private String objectId;

    @Column(name = "user_type")
    private String userType;

    @Column(name = "email")
    private String email;

    @Column(name = "active_status")
    private Boolean activeStatus;

    @Column(name = "updatedAt")
    private String updated_at;

    @Column(name = "entry_date")
    private String entryDate;

}
