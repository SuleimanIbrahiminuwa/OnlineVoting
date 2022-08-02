package com.example.onlinevoting.repositories;

import com.example.onlinevoting.models.Candidates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CandidatesRepo extends JpaRepository<Candidates, Long> {

    Optional<Candidates> findCandidatesByCandidate_id(Long id);
}
