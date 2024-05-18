package com.example.departament.respositoreis;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.departament.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
