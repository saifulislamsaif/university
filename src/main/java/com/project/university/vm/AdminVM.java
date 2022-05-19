package com.project.university.vm;

import lombok.Data;

@Data
public class AdminVM {
    Long id;
    String name;
    String email;
    String phone;
    String password;
    String updated_at;
    String entryDate;
}
