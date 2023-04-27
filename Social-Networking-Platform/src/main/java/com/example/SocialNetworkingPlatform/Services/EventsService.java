package com.example.SocialNetworkingPlatform.Services;

import com.example.SocialNetworkingPlatform.Models.Comments;
import com.example.SocialNetworkingPlatform.Models.Events;
import com.example.SocialNetworkingPlatform.Respositories.EventsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventsService {

    @Autowired
    EventsRespository eventsRespository;

    public List<Events> getAllEvents() {
        return eventsRespository.findAll();
    }

}
