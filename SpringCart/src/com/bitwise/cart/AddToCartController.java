package com.bitwise.cart;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddToCartController {
	@RequestMapping (value="/Cart" ,method=RequestMethod.GET)
	public String initialze(Model model){
	model.addAttribute("ItemDetail",new ItemDetail());	
	return "Cart";
	}

}