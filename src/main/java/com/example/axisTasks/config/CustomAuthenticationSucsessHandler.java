package com.example.axisTasks.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.axisTasks.entity.User;
import com.example.axisTasks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;



@Component
public class CustomAuthenticationSucsessHandler implements AuthenticationSuccessHandler {
	
	@Autowired
	private UserService userService;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,HttpServletResponse response,Authentication authentication) 
	throws IOException,ServletException{
		System.out.println("inside CustomAuthenticationSucsessHandler :");
		
		String username=authentication.getName();
		
		System.out.println("username ="+username);
		
		User theUser=userService.findByUserName(username);
		
		HttpSession session=request.getSession();
		session.setAttribute("user", theUser);
		
		response.sendRedirect(request.getContextPath()+"/api/tasks");
				
				
				
				
	}
}
