package com.example.registration.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@Table(name = "user_registration_state", schema = "user")
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationState {

    @Id
    @Column(name = "user_id")
    private Long id;

    @Column(name = "sent_code_time", nullable = false)
    private LocalDateTime sentCodeTime;

    @Column(name = "sms_request_iter", nullable = false)
    private Short smsRequestIter;

    @Column(name = "sms_check_iter", nullable = false)
    private Short smsCheckIter;

    @Column(name = "block_timestamp", nullable = false)
    private LocalDateTime blockTimestamp;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;
}
