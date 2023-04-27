package com.example.SocialNetworkingPlatform.Services;

import com.example.SocialNetworkingPlatform.Models.Posts;
import com.example.SocialNetworkingPlatform.Models.Users;
import com.example.SocialNetworkingPlatform.Respositories.UsersRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    UsersRespository usersRespository;

    public List<Users> getAllUsers() {

        return usersRespository.findAll();
    }
}
