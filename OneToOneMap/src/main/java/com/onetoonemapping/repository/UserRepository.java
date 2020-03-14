package com.onetoonemapping.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.onetoonemapping.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
