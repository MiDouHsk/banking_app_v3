package com.demo_bankapp_v3.service;

import com.demo_bankapp_v3.models.entity.Account;
import com.demo_bankapp_v3.models.entity.User;


public interface AccountService {
    public Account createAccount(User user);
    public boolean isPinCreated(String accountNumber) ;
    public void createPIN(String accountNumber, String password, String pin) ;
    public void updatePIN(String accountNumber, String oldPIN, String password, String newPIN);
    public void cashDeposit(String accountNumber, String pin, double amount);
    public void cashWithdrawal(String accountNumber, String pin, double amount);
    public void fundTransfer(String sourceAccountNumber, String targetAccountNumber, String pin, double amount);
}
