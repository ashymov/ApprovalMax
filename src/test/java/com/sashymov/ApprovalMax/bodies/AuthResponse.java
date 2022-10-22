package com.sashymov.ApprovalMax.bodies;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class AuthResponse {
    private User user;
    @JsonProperty("token")
    private String token;
    private String tokenType;
    private List<Role> roles;
    private List<School> schools;
}
