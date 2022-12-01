package com.example.demo.java.classes.controller;

import com.example.demo.java.classes.dto.HumanDTO;
import com.example.demo.java.classes.entity.Authentication;
import com.example.demo.java.classes.repository.AuthenticationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

//@Controller
@RestController
@RequiredArgsConstructor
public class TestController {
    private final AuthenticationRepository authenticationRepository;
/*
    @GetMapping("/test")
    @ResponseBody
    public String test(@RequestParam("login") String userName, @RequestParam("password") String passWord,
                       @ModelAttribute Authentication humanDTO, Model model) throws SQLException {

        humanDTO.setUsername(userName);
        humanDTO.setPassword(passWord);

        for (Authentication authentication : authenticationRepository.findAll()) {

            System.out.println(humanDTO.getUsername() + " " + humanDTO.getPassword());

            if (authentication.getUsername().equals(humanDTO.getUsername())) {
                model.addAttribute("error", "wrong credentials");
                return "User already exits ! ";
            }
        }

        authenticationRepository.save(new Authentication(humanDTO.getUsername(), humanDTO.getPassword()));
        return "User successfully added !\nUsername [ " + userName + " ] \nPassword [ " + passWord + " ]";
    }*/

        @PostMapping("/user")
        public HumanDTO registerUserCredential(@RequestBody HumanDTO user) {
            System.out.println("User     ID: " + user.getUsername());
            System.out.println("Password ID: " + user.getPassword());
            return user;
        }
}