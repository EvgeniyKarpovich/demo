package com.example.registration.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@Table(name = "notifications", schema = "user")
@AllArgsConstructor
@NoArgsConstructor
public class Notifications {

    @Id
    @Column(name = "user_id")
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(name = "notification_Type", nullable = false)
    private NotificationType notificationType;

    @Column(name = "is_turn_on", nullable = false)
    private boolean isTurnOn;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;
}
