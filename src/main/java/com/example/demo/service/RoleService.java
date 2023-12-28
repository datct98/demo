package com.example.demo.service;

import com.example.demo.entities.Role;
import com.example.demo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public void insertRole(String name){
        roleRepository.insertRole(name);
    }

    public void findByName(String name){
        Role role = roleRepository.findByName(name);
        System.out.println(role);
    }
}
