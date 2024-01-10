package com.example.registration.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "credentials", schema = "user")
public class Credentials {

    @Id
    @Column(name = "user_id")
    private UUID id;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "password_date", nullable = false)
    private LocalDate passwordDate;

    @Column(name = "security_question", nullable = false)
    private String securityQuestion;

    @Column(name = "answer", nullable = false)
    private String answer;

    @MapsId
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
