package com.example.SocialNetworkingPlatform.Services;

import com.example.SocialNetworkingPlatform.Models.Followers;
import com.example.SocialNetworkingPlatform.Models.Groups;
import com.example.SocialNetworkingPlatform.Respositories.GroupsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupsService {

    @Autowired
    GroupsRespository groupsRespository;

    public List<Groups> getAllGroups() {
        return groupsRespository.findAll();
    }

}
