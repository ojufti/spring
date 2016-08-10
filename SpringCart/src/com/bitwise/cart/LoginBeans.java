package com.bitwise.cart;

import org.springframework.validation.Validator;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.Size;

public class LoginBeans  {
	
private String username, password;

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}


}
