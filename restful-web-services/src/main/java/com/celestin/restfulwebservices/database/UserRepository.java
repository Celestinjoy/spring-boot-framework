package com.celestin.restfulwebservices.database;

import com.celestin.restfulwebservices.user.User;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
