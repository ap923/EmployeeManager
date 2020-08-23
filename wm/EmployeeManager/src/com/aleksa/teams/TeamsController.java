
package com.aleksa.teams;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TeamsController {
	@Autowired
	private TeamsService teamsService;
	
	@RequestMapping("/teams") //Makes sure teams.jsp is selected
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("teams"); //Loads teams.jsp
		
		List<Teams> teams = teamsService.listAll(); //Gets all teams from db
		mav.addObject("listTeams",teams); //Displays in view
		return mav;
	}

}