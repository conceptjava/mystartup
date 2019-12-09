package com.mystartup.conceptjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UIController {
	
	@GetMapping({"/","/ui"})
	
	public ModelAndView uiIndexPage()
	{
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	
	

}
