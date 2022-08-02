package com.example.onlinevoting.repositories;

import com.example.onlinevoting.models.Positions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionsRepo extends JpaRepository<Positions, Long> {
}
