package com.example.onlinevoting.repositories;

import com.example.onlinevoting.models.Votes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotesRepo extends JpaRepository<Votes, Long> {
}
