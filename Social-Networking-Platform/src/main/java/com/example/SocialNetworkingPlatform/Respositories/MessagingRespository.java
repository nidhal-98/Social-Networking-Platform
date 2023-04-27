package com.example.SocialNetworkingPlatform.Respositories;

import com.example.SocialNetworkingPlatform.Models.Messaging;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagingRespository extends JpaRepository<Messaging, Integer> {
}
