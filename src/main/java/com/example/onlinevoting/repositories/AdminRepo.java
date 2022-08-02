package com.example.onlinevoting.repositories;

import com.example.onlinevoting.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Long> {

    Admin findAdminById(Long id);
}
