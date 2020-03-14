package com.springbootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springbootmvc.model.Interview;
@Controller
public class MyController1 {

	
	@RequestMapping("/home")
	public ModelAndView home( ) {
		
		  ModelAndView mv = new ModelAndView("InterviewApplicationForm");
		  
		return mv;

}
	
	@RequestMapping("/form")
	public ModelAndView comment( ) {
		
		  ModelAndView mv = new ModelAndView("index");
		  
		return mv;

}
	
	@RequestMapping("/commentSubmission")
	public ModelAndView result(@RequestParam("name") int name,@RequestParam("comment") int comment ) {
		
		  ModelAndView mv = new ModelAndView("result");
	 
		  
		  mv.addObject("m",name+comment);
		  
		return mv;

}

	
	@RequestMapping("/view")
	
	public ModelAndView submitform(@ModelAttribute("msg") Interview interview)
	{
		ModelAndView mv=new ModelAndView("InterviewDetails");
		
		return mv;
	}
}
