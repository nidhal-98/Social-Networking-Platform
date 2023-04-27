package com.example.SocialNetworkingPlatform.Services;

import com.example.SocialNetworkingPlatform.Models.Notifications;
import com.example.SocialNetworkingPlatform.Models.Posts;
import com.example.SocialNetworkingPlatform.Respositories.PostsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService {

    @Autowired
    PostsRespository postsRespository;

    public List<Posts> getAllPosts() {

        return postsRespository.findAll();
    }
}
