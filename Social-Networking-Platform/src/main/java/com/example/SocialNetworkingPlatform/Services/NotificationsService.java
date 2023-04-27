package com.example.SocialNetworkingPlatform.Services;

import com.example.SocialNetworkingPlatform.Models.Messaging;
import com.example.SocialNetworkingPlatform.Models.Notifications;
import com.example.SocialNetworkingPlatform.Respositories.NotificationsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationsService {

    @Autowired
    NotificationsRespository notificationsRespository;

    public List<Notifications> getAllNotifications() {

        return notificationsRespository.findAll();
    }
}
