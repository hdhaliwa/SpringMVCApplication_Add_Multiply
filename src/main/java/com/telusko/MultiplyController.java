package com.telusko;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.service.AddService;

@Controller
public class MultiplyController 
{
	@RequestMapping("/multiply")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) 
	{
		int i=Integer.parseInt(request.getParameter("t3"));
		int j=Integer.parseInt(request.getParameter("t4"));
		
		AddService as =new AddService();
		int k = as.multiply(i, j); 
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result",k);
		
		return mv;
	}
}
