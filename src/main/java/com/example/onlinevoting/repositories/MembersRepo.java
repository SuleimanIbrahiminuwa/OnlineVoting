package com.example.onlinevoting.repositories;

import com.example.onlinevoting.models.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembersRepo extends JpaRepository<Members, Long> {

}
