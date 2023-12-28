package com.example.demo.repository;

import com.example.demo.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    @Modifying
    @Transactional
    @Query(value = "insert into Role(name) values(?)", nativeQuery = true)
    void insertRole(String name);

    @Query(value = "select * from role where name =?", nativeQuery = true)
    Role findByName(String name);
}
