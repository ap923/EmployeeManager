package com.aleksa.employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param; //creates reads updates and deletes db

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
