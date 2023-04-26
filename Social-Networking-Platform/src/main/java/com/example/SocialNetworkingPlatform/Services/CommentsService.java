package com.example.SocialNetworkingPlatform.Services;

import com.example.SocialNetworkingPlatform.Models.Comments;
import com.example.SocialNetworkingPlatform.Respositories.CommentsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsService {

    @Autowired
    CommentsRespository commentsRespository;

    public List<Comments> getAllComments() {
        return commentsRespository.findAll();
    }

}
