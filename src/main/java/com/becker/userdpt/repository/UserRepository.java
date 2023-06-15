package com.becker.userdpt.repository;

import com.becker.userdpt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}