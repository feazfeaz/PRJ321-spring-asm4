package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.ModelStudent;

@Controller
public class Kip {

	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView yoh(){
		System.out.println("home");
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("keyA", "valueA");
		return modelAndView;
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView postLogin(HttpServletRequest req, HttpServletResponse res){
		System.out.println("login post");
//		System.out.println(req.getParameter("username"));
//		System.out.println(req.getParameter("password"));
		ModelAndView modelAndView = null;
		if(req.getParameter("username").trim().equals("admin")
				&& req.getParameter("password").trim().equals("admin") ){
			modelAndView = new ModelAndView("success");
		}else{
//			System.out.println("đăng nhập sai");
			modelAndView = new ModelAndView("home");
			modelAndView.addObject("error","You wrong your name or password");
		}
//		modelAndView.addObject("keyA", "valueA");
		return modelAndView;
	}
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public ModelAndView admin(){
		System.out.println("admin");
		ModelAndView modelAndView = new ModelAndView("reuse/admin");
		modelAndView.addObject("keyA", "valueB");
		return modelAndView;
	}
	
	@RequestMapping(value="/cart",method=RequestMethod.POST)
	public ModelAndView addToCart(@ModelAttribute ModelStudent student){
		System.out.println("cart");
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("keyA", student.getId() + " " 
		+ student.getAge() + " "
		+ student.getName() + " ");
		return modelAndView;
	}
	
	@RequestMapping(value="/returnNull",method=RequestMethod.GET)
	public ModelAndView returnNull(){
		return null;
	}
}
