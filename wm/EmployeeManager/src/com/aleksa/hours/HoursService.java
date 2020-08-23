package com.aleksa.hours;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class HoursService {
	@Autowired
	HoursRepository repo;
	HoursRepository rep;

	public List<Hours> listAll() {
		return (List<Hours>) repo.findAll();
	}
	

	public String hoursWorked(Long eid, List<Hours> hours, Long pid) {
		// Method that returns how many hours has an employee with id eid worked on
		// project with id pid
		int h = 0;
		String beg = "Employee with id: ";
		String mid = " has worked ";
		String end = " hours on project with id: " ;

		if (!hours.isEmpty()) {
			for (Hours result : hours) {
				if (eid == result.getEid() && pid == result.getPid()) {
					h += result.getHours();
				}
			}
		}
		String fin = beg + eid.toString() + mid + h + end + pid.toString();
		return fin;
	}

}
