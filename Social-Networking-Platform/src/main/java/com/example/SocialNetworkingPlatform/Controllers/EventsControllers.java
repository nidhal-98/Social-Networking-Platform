package com.example.SocialNetworkingPlatform.Controllers;

import com.example.SocialNetworkingPlatform.Models.Comments;
import com.example.SocialNetworkingPlatform.Models.Events;
import com.example.SocialNetworkingPlatform.Respositories.EventsRespository;
import com.example.SocialNetworkingPlatform.Services.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("events")
public class EventsControllers {

    @Autowired
    EventsService eventsService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Events> getAllEvents() {
        return eventsService.getAllEvents();
    }
}
