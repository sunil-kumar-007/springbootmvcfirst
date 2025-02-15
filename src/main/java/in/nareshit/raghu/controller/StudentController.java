package in.nareshit.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
	
	@RequestMapping(value = "/show",method = RequestMethod.POST)
	public String showPage() {
		System.out.println("HELLO");
		return "StudentHome";
	}
}
