package com.example.SocialNetworkingPlatform.Services;

import com.example.SocialNetworkingPlatform.Models.Groups;
import com.example.SocialNetworkingPlatform.Models.Likes;
import com.example.SocialNetworkingPlatform.Respositories.LikesRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikesService {

    @Autowired
    LikesRespository likesRespository;

    public List<Likes> getAllLikes() {
        return likesRespository.findAll();
    }

}
