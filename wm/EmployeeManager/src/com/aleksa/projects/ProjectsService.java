package com.aleksa.projects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProjectsService {
	@Autowired
	ProjectsRepository repo;

	public List<Projects> listAll() {
		return (List<Projects>) repo.findAll();
	}

}
