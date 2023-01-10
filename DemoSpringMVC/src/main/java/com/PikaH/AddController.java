package com.PikaH;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.PikaH.service.AddService;
import com.utility.StringCheck;

@Controller
public class AddController {
	@RequestMapping("/add")
	public ModelAndView add(
			@RequestParam("t1") String i,
			@RequestParam("t2") String j,
			HttpServletRequest request, 
			HttpServletResponse response) 
	{
		int result = 0;
		String error = "";
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		
		StringCheck sc = new StringCheck();
		if(!sc.isNumeric(i) || !sc.isNumeric(j)) {
			error = "Please fulfill all the input!";
		} else {
			AddService as = new AddService();
			result = as.add(Integer.parseInt(i), Integer.parseInt(j));
		}
		mv.addObject("result",result);
		mv.addObject("error",error);
		return mv;
	}
}
