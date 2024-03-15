package com.demo_bankapp_v3.repository;

import com.demo_bankapp_v3.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // do to:
}
