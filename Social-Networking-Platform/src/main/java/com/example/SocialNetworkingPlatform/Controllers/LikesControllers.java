package com.example.SocialNetworkingPlatform.Controllers;

import com.example.SocialNetworkingPlatform.Models.Groups;
import com.example.SocialNetworkingPlatform.Models.Likes;
import com.example.SocialNetworkingPlatform.Services.LikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("likes")
public class LikesControllers {

    @Autowired
    LikesService likesService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Likes> getAllLikes() {
        return likesService.getAllLikes();
    }
}
