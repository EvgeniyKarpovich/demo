package com.example.registration.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@Table(name = "users", schema = "security")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private PersonalInfo personalInfo;

    @Column(name = "password", nullable = false)
    private boolean registered;
    
    @OneToMany(mappedBy = "user")
    private List<Token> tokens = new ArrayList<>();
}
