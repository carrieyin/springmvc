package com.ydd.study.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping("/hello")
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("hello", "first spring mvc");
		mv.setViewName("/WEB-INF/jsps/index.jsp");
		return mv;
	}
	@RequestMapping("/hello1")
	@ResponseBody
	public String hello1() throws Exception {
		return "hello" ;
	}
	
	@RequestMapping("/hello2")
	@ResponseBody
	public List<String> hello2() throws Exception {
		List<String> list = new ArrayList<String>() ;
		list.add("a1") ;
		list.add("b1") ;
		list.add("c1") ;
		return list ;
	}

}
