package com.demo_bankapp_v3.controller;

import com.demo_bankapp_v3.mapper.AccountAndUserMapper;
import com.demo_bankapp_v3.models.dto.UserDto;
import com.demo_bankapp_v3.models.entity.User;
import com.demo_bankapp_v3.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;
    private final AccountAndUserMapper mapper;

    public UserController(UserService userService, AccountAndUserMapper mapper) {
        this.userService = userService;
        this.mapper = mapper;
    }

    @PostMapping("/register")
    public ResponseEntity<UserDto> registerUser(@RequestBody UserDto userDto) {
        User user = mapper.convertToEntity(userDto);

        User newUser = userService.registerUser(user);

        UserDto newUserDto = mapper.convertToDto(user);
        return new ResponseEntity<>(newUserDto, HttpStatus.CREATED);
    }
}
