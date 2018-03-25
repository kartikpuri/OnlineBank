package com.userfront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {

	@Autowired AppointmentService appontmentService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/create", method= RequestMethod.GET)
	public String createAppointment(Model model) {
		Appointment appointment = new Appointment();
		model.addAllAttributes("appointment", appointment);
		model.addAttribute("dateString", "");
		
		return "appointment";
	}
}
