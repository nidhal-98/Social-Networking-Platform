package com.example.SocialNetworkingPlatform.Controllers;

import com.example.SocialNetworkingPlatform.Models.Likes;
import com.example.SocialNetworkingPlatform.Models.Messaging;
import com.example.SocialNetworkingPlatform.Services.MessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("messages")
public class MessagingControllers {

    @Autowired
    MessagingService messagingService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Messaging> getAllMessages() {
        return messagingService.getAllMessages();
    }
}
