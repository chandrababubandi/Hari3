package in.scb.springfy.SearchAppWeb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to My First Web Application" ;
	}
}
