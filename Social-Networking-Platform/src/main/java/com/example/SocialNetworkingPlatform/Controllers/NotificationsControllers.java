package com.example.SocialNetworkingPlatform.Controllers;

import com.example.SocialNetworkingPlatform.Models.Messaging;
import com.example.SocialNetworkingPlatform.Models.Notifications;
import com.example.SocialNetworkingPlatform.Services.NotificationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("notifications")
public class NotificationsControllers {

    @Autowired
    NotificationsService notificationsService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Notifications> getAllNotifications() {

        return notificationsService.getAllNotifications();
    }
}
