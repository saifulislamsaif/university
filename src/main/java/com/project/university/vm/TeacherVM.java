package com.project.university.vm;

import lombok.Data;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;


@Data
public class TeacherVM {
     Long id;
     String name;
     String email;
     String phone;
     String password;
     String dept_id;
     String updated_at;
     String entryDate;
}
