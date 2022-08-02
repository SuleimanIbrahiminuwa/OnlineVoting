package com.example.onlinevoting.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Entity
public class Positions extends Base{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long position_id;
    private String position_name;

}
