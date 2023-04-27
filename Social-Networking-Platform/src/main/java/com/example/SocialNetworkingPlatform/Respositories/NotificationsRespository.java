package com.example.SocialNetworkingPlatform.Respositories;

import com.example.SocialNetworkingPlatform.Models.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationsRespository extends JpaRepository<Notifications, Integer> {
}
