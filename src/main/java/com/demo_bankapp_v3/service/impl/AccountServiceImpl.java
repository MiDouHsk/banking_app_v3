package com.demo_bankapp_v3.service.impl;

import com.demo_bankapp_v3.models.entity.Account;
import com.demo_bankapp_v3.models.entity.User;
import com.demo_bankapp_v3.repository.AccountRepository;
import com.demo_bankapp_v3.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Override
    public Account createAccount(User user) {
        Account account = new Account();
        account.setUser(user);
        account.setAccountNumber(generateAccountNumber());
        account.setBalance(0.0);
        return accountRepository.save(account);
    }
    private String generateAccountNumber() {
        // Implement your logic here to generate a new account number
        return "YourGeneratedAccountNumber";
    }

    @Override
    public boolean isPinCreated(String accountNumber) {
        return false;
    }

    @Override
    public void createPIN(String accountNumber, String password, String pin) {

    }

    @Override
    public void updatePIN(String accountNumber, String oldPIN, String password, String newPIN) {

    }

    @Override
    public void cashDeposit(String accountNumber, String pin, double amount) {

    }

    @Override
    public void cashWithdrawal(String accountNumber, String pin, double amount) {

    }

    @Override
    public void fundTransfer(String sourceAccountNumber, String targetAccountNumber, String pin, double amount) {

    }
}
