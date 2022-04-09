package com.vi.hopper_jps.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//this returns the templates
public class HomeController {

	// class definition and imports here...
	@RequestMapping("/")
	public String index(Model model) {

//		**** pass these variables to the template *****
		String name = "Grace Hopper";
		String itemName = "Copper wire";
		double price = 5.25;
		String description = "Metal strips, also an illustration of nanoseconds.";
		String vendor = "Little Things Corner Store";

		model.addAttribute("name", name);
		model.addAttribute("itemName", itemName);
		model.addAttribute("price", price);
		model.addAttribute("description", description);
		model.addAttribute("vendor", vendor);

		return "index.jsp";
	}
	// ...

}
