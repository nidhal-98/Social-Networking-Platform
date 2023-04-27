package com.example.SocialNetworkingPlatform.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int user_id;

    String userNickName;


    @OneToMany
    @JoinColumn(name = "post_id")
    Posts post;

    @OneToMany
    @JoinColumn(name = "comments_id")
    Comments comments;

    @OneToMany
    @JoinColumn(name = "follower_id")
    Followers follower;

    @OneToMany
    @JoinColumn(name = "notification_id")
    Notifications notification;

}
