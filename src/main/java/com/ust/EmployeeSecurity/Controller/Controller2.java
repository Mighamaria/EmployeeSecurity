package com.ust.EmployeeSecurity.Controller;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	
	@RestController
	@RequestMapping("/emp")
	public class Controller2 {
	
	
		@GetMapping("/goodmorning")
		public String greeting() {
			return "hai mighaa good morning";
		}
}
