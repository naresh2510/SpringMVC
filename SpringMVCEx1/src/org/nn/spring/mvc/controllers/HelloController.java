package org.nn.spring.mvc.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/welcome/{user}/{message}")
	public ModelAndView helloworld(@PathVariable Map<String,String> pathVars) {
		String user1 =pathVars.get("user");
		String mes1=pathVars.get("message");
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","Howdy ? "+user1 +" " +mes1);
		
		return model;
	}
	
}
