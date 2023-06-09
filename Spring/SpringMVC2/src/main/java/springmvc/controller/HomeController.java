package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home URL");
		model.addAttribute("name", "Anmol sahu");
		List<String> list = new ArrayList<String>();
		list.add("Anmol");
		list.add("aanshi");
		list.add("dev");

		model.addAttribute("f", list);
		
		return "home";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about");"
		return "about";
	}
	
}
