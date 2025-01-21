package com.yassinechalh.user.repository;

import com.yassinechalh.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Yassine CHALH
 */
public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByEmail(String email);
}
