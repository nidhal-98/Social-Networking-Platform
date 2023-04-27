package com.example.SocialNetworkingPlatform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "events")
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int event_id;

    /*
    @ManyToOne
    @JoinColumn(name = "user_id")
    Users user;*/
}
