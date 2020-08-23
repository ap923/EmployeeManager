
package com.aleksa.employee;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/employees")
	public ModelAndView home() {

		ModelAndView mav = new ModelAndView("employees");
		List<Employee> employees = employeeService.listAll(); // Gets all employees from the db
		mav.addObject("listEmployee", employees); // Displays in view
		return mav;
	}

}