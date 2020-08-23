package com.aleksa.teams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;



@Service

public class TeamsService {
	@Autowired  TeamsRepository repo;
    
  
    public List<Teams> listAll() {
        return (List<Teams>) repo.findAll(); //lists all teams from db
    }
     
}
