package com.spring.container.core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.container.core.beans.Student;

public class Main {

	public static void main(String[] args) {

		//this is the path of Xml File
		String config_loc = "/com/spring/container/core/resources/applicationContext.xml";
		//we have this interface AplicationContext
		//ClassPathXmlApplicationContext is a core Spring container implementation used to load the Spring configuration XML file(s) 
		//from the classpath and create/manage all beans defined inside it.
		
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);

		//we are only retrieving the already-created bean from the Spring container.
		Student std = (Student) context.getBean("stdId");
		std.display();//std = a reference variable pointing to a Student object created by Spring Container.

		Student std1 = (Student) context.getBean("stdId1");
		std1.display();

		Student std3 = (Student) context.getBean("stdId3");
		std3.display();

		
	}
}

//this application  using XML Configuration.

//spring Expression
//spring commons
//spring core
//spring Context
//spring loggins