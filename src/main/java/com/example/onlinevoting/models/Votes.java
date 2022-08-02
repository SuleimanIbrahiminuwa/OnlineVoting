package com.example.onlinevoting.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Entity
public class Votes extends Base{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String position;

    private String candidateName;

    @ManyToOne
    private Members voter_id;
}
