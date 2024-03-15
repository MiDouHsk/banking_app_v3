package com.demo_bankapp_v3.models.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String username;
    private String email;
    private String fullName;
    private String address;
    private String phoneNumber;
    private List<AccountDto> accounts;
}
