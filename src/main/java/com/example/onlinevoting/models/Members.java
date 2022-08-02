package com.example.onlinevoting.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Entity
public class Members extends Base{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long member_id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @OneToMany(targetEntity = Votes.class, mappedBy = "voter_id")
    private List<Votes> votesList;

}
//echo "# OnlineVoting" >> README.md
//        git init
//        git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add origin https://github.com/SuleimanIbrahiminuwa/OnlineVoting.git
//        git push -u origin main