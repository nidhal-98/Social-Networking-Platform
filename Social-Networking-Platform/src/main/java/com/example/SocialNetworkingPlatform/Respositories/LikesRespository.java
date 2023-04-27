package com.example.SocialNetworkingPlatform.Respositories;

import com.example.SocialNetworkingPlatform.Models.Likes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikesRespository extends JpaRepository<Likes, Integer> {
}
