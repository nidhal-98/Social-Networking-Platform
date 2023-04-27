package com.example.SocialNetworkingPlatform.Services;

import com.example.SocialNetworkingPlatform.Models.Likes;
import com.example.SocialNetworkingPlatform.Models.Messaging;
import com.example.SocialNetworkingPlatform.Respositories.MessagingRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessagingService {

    @Autowired
    MessagingRespository messagingRespository;

    public List<Messaging> getAllMessages() {

        return messagingRespository.findAll();
    }

}
