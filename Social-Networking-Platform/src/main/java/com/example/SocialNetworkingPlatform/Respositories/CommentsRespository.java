package com.example.SocialNetworkingPlatform.Respositories;

import com.example.SocialNetworkingPlatform.Models.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRespository extends JpaRepository<Comments, Integer> {
}
