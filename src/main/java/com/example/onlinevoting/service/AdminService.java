package com.example.onlinevoting.service;

import com.example.onlinevoting.dto.AdminDto;
import com.example.onlinevoting.dto.CandidatesDto;
import com.example.onlinevoting.dto.PositionsDto;
import com.example.onlinevoting.models.Candidates;
import com.example.onlinevoting.models.Pagination;
import com.example.onlinevoting.models.Positions;
import org.springframework.data.domain.Page;

import java.util.List;

public interface AdminService {

   String updateAccount(AdminDto adminDto);


   void viewVoteResult(PositionsDto positionsDto);

   String addNewCandidates(CandidatesDto candidatesDto);
   String deleteCandidates(CandidatesDto candidatesDto);

   String deletePositions(CandidatesDto candidatesDto);
   String addNewPositions(PositionsDto positionsDto);

   List<Positions> selectPositions();
   Page<Candidates> viewAllCandidates(Pagination pagination);
}
