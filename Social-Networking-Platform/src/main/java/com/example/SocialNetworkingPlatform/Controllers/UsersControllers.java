package com.example.SocialNetworkingPlatform.Controllers;

import com.example.SocialNetworkingPlatform.Models.Posts;
import com.example.SocialNetworkingPlatform.Models.Users;
import com.example.SocialNetworkingPlatform.Services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UsersControllers {

    @Autowired
    UsersService usersService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Users> getAllUsers() {

        return usersService.getAllUsers();
    }
}
