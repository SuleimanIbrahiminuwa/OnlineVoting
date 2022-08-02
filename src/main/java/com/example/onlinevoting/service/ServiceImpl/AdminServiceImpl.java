package com.example.onlinevoting.service.ServiceImpl;


import com.example.onlinevoting.dto.AdminDto;
import com.example.onlinevoting.dto.CandidatesDto;
import com.example.onlinevoting.dto.PositionsDto;
import com.example.onlinevoting.models.Candidates;
import com.example.onlinevoting.models.Pagination;
import com.example.onlinevoting.models.Positions;
import com.example.onlinevoting.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {



    @Override
    public String updateAccount(AdminDto adminDto) {

        return null;
    }

    @Override
    public void viewVoteResult(PositionsDto positionsDto) {

    }

    @Override
    public String addNewCandidates(CandidatesDto candidatesDto) {
        return null;
    }

    @Override
    public String deleteCandidates(CandidatesDto candidatesDto) {
        return null;
    }

    @Override
    public String deletePositions(CandidatesDto candidatesDto) {
        return null;
    }

    @Override
    public String addNewPositions(PositionsDto positionsDto) {
        return null;
    }

    @Override
    public List<Positions> selectPositions() {
        return null;
    }

    @Override
    public Page<Candidates> viewAllCandidates(Pagination pagination) {
        return null;
    }
}
