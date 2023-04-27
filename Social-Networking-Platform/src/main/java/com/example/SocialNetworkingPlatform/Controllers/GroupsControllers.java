package com.example.SocialNetworkingPlatform.Controllers;

import com.example.SocialNetworkingPlatform.Models.Followers;
import com.example.SocialNetworkingPlatform.Models.Groups;
import com.example.SocialNetworkingPlatform.Services.GroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("groups")
public class GroupsControllers {

    @Autowired
    GroupsService groupsService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Groups> getAllGroups() {
        return groupsService.getAllGroups();
    }
}
