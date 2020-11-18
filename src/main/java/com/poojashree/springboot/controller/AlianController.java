package com.poojashree.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.poojashree.springboot.dao.AlianDao;
import com.poojashree.springboot.model.Alian;

@Controller
@ComponentScan("com.poojashree.springboot")
public class AlianController {
	
	
	
	
	@Autowired
	AlianDao dao;
	@RequestMapping("/")
public String home() {
	return "home.jsp";
	
}
	
	@RequestMapping("/addAlian")

	
		public String addAlian(Alian alian) {
		dao.save(alian);
			return "home.jsp";
		}
	
	@RequestMapping("/getAlian")
	public ModelAndView getAlian(@RequestParam int aid)
	{
		ModelAndView mv=new ModelAndView("showalian.jsp");
				Alian alian=dao.findById(aid).orElse(new Alian());
                     mv.addObject(alian);
                    		 
		 return mv;
		
	}

	}
	
	

