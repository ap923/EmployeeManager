package com.aleksa.teams;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param; //creates reads updates and deletes db


public interface TeamsRepository extends CrudRepository<Teams, Long> {

}
