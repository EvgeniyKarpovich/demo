package com.example.registration.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "passports", schema = "auth")
public class Passport {

    @Id
    @Column(name = "user_id")
    private Long id;

    @Column(name = "series", nullable = false)
    private String series;

    @Column(name = "number", nullable = false)
    private String number;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;
}
