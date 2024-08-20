package com.example.demo.services;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.demo.api.models.LoginModel;
import com.example.demo.api.models.UserModel;
import com.example.demo.api.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userrepository;

    public UserService(UserRepository userrepository) {
        this.userrepository = userrepository;
    }

    public UserModel SignUp(UserModel user) {
        UserModel response = new UserModel(null, null, 0, null, 0, null, null);
        UserModel userExists = new UserModel();
        userExists = userrepository.findByEmail(user.getEmail());

        if (userExists != null) {
            return response = null;
        }
        response = userrepository.save(user);
        return response;

    }

    public UserModel Login(LoginModel user) {
        UserModel response = new UserModel(null, null, 0, null, 0, null, null);
        response = userrepository.findByEmail(user.getEmail());
        if (response != null && response.getPassword().equals(user.getPassword())) {
            return response;
        }
        return response = null;
    }
}
