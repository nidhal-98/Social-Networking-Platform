package com.example.SocialNetworkingPlatform.Controllers;

import com.example.SocialNetworkingPlatform.Models.Comments;
import com.example.SocialNetworkingPlatform.Services.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("comments")
public class CommentsControllers {

    @Autowired
    CommentsService commentsService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Comments> getAllComments() {
        return commentsService.getAllComments();
    }

    }
