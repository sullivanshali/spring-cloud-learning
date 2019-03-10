package com.shaliy.provider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shaliy.provider.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
