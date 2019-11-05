package com.employee.Config;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class ReadAppPropFile {

		@Value("${employee.count}")
		private int employeeCount;
		
		public int getemployeeCount() {
			return employeeCount;
		}

		public void setemployeeCount(String employeeCount) {
			this.employeeCount = 5;
		}

	
		@Value("${employee.age}")
private int getemployeeAge;
		
		public int getemployeeAge() {
			return getemployeeAge;
		}

		public void setemployeeAge(String getemployeeAge) {
			this.getemployeeAge = 37;
		}

	    
	}
	


