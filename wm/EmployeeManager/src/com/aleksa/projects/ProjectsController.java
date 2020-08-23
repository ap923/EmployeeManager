
package com.aleksa.projects;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProjectsController {
	@Autowired
	private ProjectsService projectsService;

	@RequestMapping("/projects")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("projects");

		List<Projects> projects = projectsService.listAll(); // Gets all projects from db
		mav.addObject("listProjects", projects); // Displays in view
		return mav;
	}

}