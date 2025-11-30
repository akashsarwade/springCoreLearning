package com.spring.container.core.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.container.core.beans.Student;

@Configuration
public class JavaConfigFile {

//	@Bean
//	public Student stdId() {// method name --->stdId()
//		Student std1 = new Student();// this is reference of Student class
//		// here we are setting the properties/values.
//		std1.setName("Vijay Singh");
//		std1.setRoll(1);
//		std1.setAddress("Gujrattt");
//		System.out.println("std1 Object- " + std1.toString());
//		return std1;// we are returning the
//	}

//	@Bean
//	public Student StdId2() {
//		Student std2 = new Student();
//		std2.setName("Akash Sarwade");
//		std2.setRoll(13);
//		std2.setAddress("Pune Mahashtra..");
//		return std2;
//	}

	@Bean("stdObj")
	public Student studentDataSet() {
		Student std3 = new Student();
		std3.setName("Vijay Singh");
		std3.setRoll(58);
		std3.setAddress("Gujrattt");
		return std3;
	}

}
