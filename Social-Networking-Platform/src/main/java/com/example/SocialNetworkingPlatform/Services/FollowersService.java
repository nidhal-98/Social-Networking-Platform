package com.example.SocialNetworkingPlatform.Services;

import com.example.SocialNetworkingPlatform.Models.Events;
import com.example.SocialNetworkingPlatform.Models.Followers;
import com.example.SocialNetworkingPlatform.Respositories.FollowersRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowersService {

    @Autowired
    FollowersRespository followersRespository;

    public List<Followers> getAllFollowers() {
        return followersRespository.findAll();
    }

}
