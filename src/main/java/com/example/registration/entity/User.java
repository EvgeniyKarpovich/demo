package com.example.registration.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@Table(name = "users", schema = "user")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "firstname", nullable = false)
    private String firstname;

    @Column(name = "lastname", nullable = false)
    private String lastname;

    @Column(name = "middlename", nullable = false)
    private String middlename;

    @Column(name = "tel_number ", nullable = false, unique = true)
    private String telNumber;

    @Column(name = "email", unique = true)
    private String email;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Credentials credentials;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private UserStatus status;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private UserRegistrationState userRegistrationState;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Passport> passports = new ArrayList<>();

//    @OneToMany(mappedBy = "user")
//    private List<Token> tokens = new ArrayList<>();
}
