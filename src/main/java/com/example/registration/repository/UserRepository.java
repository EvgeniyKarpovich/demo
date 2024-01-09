package com.example.registration.repository;

import com.example.registration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByTelNumber(String telNumber);

    @Query("""
            SELECT count(u) > 0 
            FROM User u
            JOIN UserRegistrationState urs ON u.id = urs.id
            WHERE u.telNumber = :telephone AND urs.registered = true
                        """)
    boolean isUserWithTelNumberRegistered(@Param("telephone") String telNumber);

}
