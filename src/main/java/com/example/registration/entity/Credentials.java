package com.example.registration.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "credentials", schema = "auth")
public class Credentials {

    @Id
    @Column(name = "user_id")
    private Long id;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

}
