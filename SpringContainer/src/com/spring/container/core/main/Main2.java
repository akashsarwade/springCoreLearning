package com.spring.container.core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.container.core.beans.Student;
import com.spring.container.core.resources.JavaConfigFile;

public class Main2 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
		
//		//1 way get bean and acces ir an retrive data
//		Student std = (Student) context.getBean("stdId");//here we retriving by beansId
//		std.display();
//
//		//2 way 
//		Student std2 = (Student) context.getBean(Student.class);//here we are retriving direct class name
//		std2.display();
//		
		//way 3
		Student stdd = (Student) context.getBean(Student.class);// here wea re added bean name and retriving method name is different 
		stdd.display();

		
	}
}

//we have added spring AOP jar file
