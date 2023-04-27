package com.example.SocialNetworkingPlatform.Controllers;

import com.example.SocialNetworkingPlatform.Models.Notifications;
import com.example.SocialNetworkingPlatform.Models.Posts;
import com.example.SocialNetworkingPlatform.Services.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("posts")
public class PostsControllers {

    @Autowired
    PostsService postsService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Posts> getAllPosts() {

        return postsService.getAllPosts();
    }
}
