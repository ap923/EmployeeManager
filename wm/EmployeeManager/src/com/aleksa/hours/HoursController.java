
package com.aleksa.hours;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HoursController {
	@Autowired
	private HoursService hoursService;

	@RequestMapping("/hours") // Makes sure hours.jsp is selected
	public ModelAndView home(@RequestParam(value = "eid", required = false) Long eid,
			@RequestParam(value = "pid", required = false) Long pid) {

		ModelAndView mav = new ModelAndView("hours"); // Loads hours view

		List<Hours> hours = hoursService.listAll();

		if (eid != null && pid != null) {
			String hw = hoursService.hoursWorked(eid, hours, pid); // Returns how many hours employee has worked on a
																// project.
			mav.addObject("hoursWorked", hw); // Displays result in view
		}

		mav.addObject("listHours", hours);

		return mav;
	}

}