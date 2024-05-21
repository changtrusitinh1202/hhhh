package com.example.userservice.controller;



import com.example.userservice.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/singer")
@RequiredArgsConstructor
public class SingerController {
    @Autowired
    UserService userService;

    @GetMapping("/singer")
    public List<User> getUser() {
        return userService.getAllUser();
    }
}
