package com.bitwise.cart;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller

public class LoginController {
	@Autowired
	LoginValidator loginValidator;
	Errors errors;
	LoginBeans login;
	@RequestMapping (value="/Login" ,method=RequestMethod.GET)
	public String initialze(Model model){
	model.addAttribute("LoginBeans",new LoginBeans());	
	return "Login";
	}
	/*@InitBinder
	private void initBinder(WebDataBinder binder){
		//binder.setValidator(login);
	}*/
	@RequestMapping (value="/Success",method=RequestMethod.POST)
	public ModelAndView submit(Model model,@ModelAttribute("LoginBeans") LoginBeans login,BindingResult result, HttpServletRequest request,HttpServletResponse response){
		if((login.getUsername().equals("niteshs")&&login.getPassword().equals("ns007"))){
			return new ModelAndView("Success","msg","welcome "+ login.getUsername());
		   
        }
        else 
        { 
        return new ModelAndView("Login","error","please enter correct details");}
	
}
	
	/* public String submitForm(@ModelAttribute("LoginBeans") LoginBeans login,
             BindingResult result, SessionStatus status) 
{

LoginValidator.validate(login, result);

if (result.hasErrors()) {
return "addEmployee";
}*/
//Store the employee information in database
//manager.createNewRecord(employeeVO);

//Mark Session Complete


}
