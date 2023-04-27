package com.example.SocialNetworkingPlatform.Respositories;

import com.example.SocialNetworkingPlatform.Models.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventsRespository extends JpaRepository<Events, Integer> {
}
