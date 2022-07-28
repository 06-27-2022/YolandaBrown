package com.rev.webservlets;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HelloExpense extends HttpServlet{

	/**
	 * 
	 */
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		
			
		response.setContentType("");
		PrintWriter writer =response.getWriter();
		writer.write("welcome");
		
	}
	
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		
		String requestBodyText = newString(request.getInputStream().readAllBytes));
		ObjectMapper objectMapper =new ObjectMapper();
		objectMapper.revalue(content, valueType);
		
		
	}
	
	
	
	
	}// end of class
	

