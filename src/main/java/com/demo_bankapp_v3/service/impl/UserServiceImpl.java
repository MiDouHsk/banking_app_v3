package com.demo_bankapp_v3.service.impl;

import com.demo_bankapp_v3.models.entity.Account;
import com.demo_bankapp_v3.models.entity.User;
import com.demo_bankapp_v3.repository.UserRepository;
import com.demo_bankapp_v3.service.AccountService;
import com.demo_bankapp_v3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final AccountService accountService;

    public UserServiceImpl(UserRepository userRepository, AccountService accountService) {
        this.userRepository = userRepository;
        this.accountService = accountService;
    }

    @Override
    public User registerUser(User user) {
        // saved user details
        User saveduser = userRepository.save(user);
        // Create an account for the user
        Account savedaccount = accountService.createAccount(saveduser);

        saveduser.getAccounts().add(savedaccount);
        userRepository.save(saveduser);

        for (Account account: saveduser.getAccount()) {
            System.out.println(account.getAccountNumber());
        }
        System.out.println(savedaccount.getUser().getUsername());

        return saveduser;
    }

    @Override
    public User getUserByAccountNumber(String accountNumber) {
        return null;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public User updateUser(User user) {
        return null;
    }
}
