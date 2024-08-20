package com.example.demo.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.models.LoginModel;
import com.example.demo.api.models.UserModel;
import com.example.demo.services.UserService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class LoginController {

    @Autowired

    private UserService userservice;

    public LoginController(UserService userservice) {
        this.userservice = userservice;
    }

    @PostMapping("/login")
    public ResponseEntity<Object> Login(@RequestBody LoginModel user) {
        UserModel Response = new UserModel(null, null, 0, null, 0, null, null);
        Response = this.userservice.Login(user);
        if (Response == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(Response);
    }

    @PostMapping("/signup")
    public ResponseEntity<UserModel> SignUp(@RequestBody UserModel user) {
        UserModel Response = new UserModel(null, null, 0, null, 0, null, null);
        Response = this.userservice.SignUp(user);
        if (Response == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(Response);
    }
}
