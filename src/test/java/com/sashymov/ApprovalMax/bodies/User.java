package com.sashymov.ApprovalMax.bodies;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String middleName;
    private String avatar;
}
