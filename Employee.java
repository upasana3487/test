package com.employee.controller;
import java.io.*;

import com.employee.controller.JSONToObject;


public class Employee {
	
	
	public static void main(String[] args) throws IOException {
		 
		JSONToObject obj = new JSONToObject();
		obj.put("emoName", "Upasana");
		obj.put("empAdd", "Patel");
		obj.put("empId", 102);
 
	
 
		// try-with-resources statement based on post comment below :)
		try (FileWriter file = new FileWriter("./file1.txt")) {
			file.write(obj.toString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj);
		}
		catch(IOException e) {
			e.printStackTrace();
		
		}
		finally {
//file.close();
		}
		}
	}

   
      
