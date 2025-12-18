package com.mirza.demo.repository;

/**
 * @author mirzbeg
 **/

import com.mirza.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

