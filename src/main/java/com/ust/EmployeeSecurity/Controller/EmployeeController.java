package com.ust.EmployeeSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class EmployeeController {
	@GetMapping("/goodmorning")
	public String greeting() {
		return "hai migha good morning";
	}
	
	

}
