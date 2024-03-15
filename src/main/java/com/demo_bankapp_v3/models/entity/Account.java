package com.demo_bankapp_v3.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "account_number", nullable = false, unique = true)
    private String accountNumber;

    @Column(nullable = false)
    private double balance;

    @Column(name = "account_type", nullable = false)
    private String accountType;

    private String branch;

    @Column(name = "IFSC_code", nullable = false)
    private String IFSCCode;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
