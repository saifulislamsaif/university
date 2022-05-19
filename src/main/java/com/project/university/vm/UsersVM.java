package com.project.university.vm;

import lombok.Data;

@Data
public class UsersVM {
     Long id;
     String objectId;
     String userType;
     String email;
     Boolean activeStatus;
     String updated_at;
     String entryDate;
}
