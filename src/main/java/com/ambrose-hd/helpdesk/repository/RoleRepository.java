package com.ambrose.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ambrose.helpdesk.model.Role;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByRole(String role);

    Role findById(int id);
}