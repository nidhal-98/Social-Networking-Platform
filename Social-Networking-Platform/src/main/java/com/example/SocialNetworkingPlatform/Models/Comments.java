package com.example.SocialNetworkingPlatform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "comments")
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int comments_id;

    /*
    @ManyToOne
    @JoinColumn(name = "post_id")
    Posts post;*/
}
