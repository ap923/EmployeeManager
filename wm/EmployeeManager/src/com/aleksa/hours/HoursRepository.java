package com.aleksa.hours;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param; //creates reads updates and deletes db

public interface HoursRepository extends CrudRepository<Hours, Long> {

}
