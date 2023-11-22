package com.wesleyarj.p23.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesleyarj.p23.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
