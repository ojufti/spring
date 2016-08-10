package com.bitwise.cart;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
@Component
public class LoginValidator {
	public boolean supports(Class<?> arg0) {
	return LoginBeans.class.equals(arg0);
	}

	public   void validate(Object obj, Errors errors) {
	LoginBeans emp = (LoginBeans) obj;
	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "error.username", "username is required.");
	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.password", "password is required.");
	          
	 }

}
