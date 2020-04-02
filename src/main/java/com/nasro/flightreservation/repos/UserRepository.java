package com.nasro.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nasro.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
