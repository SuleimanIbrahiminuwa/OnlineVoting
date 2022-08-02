package com.example.onlinevoting.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Entity
public class Candidates extends Base{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long candidate_id;

    private String candidateName;

    private String candidatePosition;

    private String candidateVotes;


}
