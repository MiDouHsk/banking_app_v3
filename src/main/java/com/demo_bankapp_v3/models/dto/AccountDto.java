package com.demo_bankapp_v3.models.dto;

import lombok.Data;

@Data
public class AccountDto {
    private Long id;
    private String accountNumber;
    private double balance;
    private String accountType;
    private String branch;
    private String IFSCCode;
}
