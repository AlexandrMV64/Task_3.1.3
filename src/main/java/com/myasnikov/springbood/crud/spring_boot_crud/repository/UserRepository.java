package com.myasnikov.springbood.crud.spring_boot_crud.repository;

import com.myasnikov.springbood.crud.spring_boot_crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}