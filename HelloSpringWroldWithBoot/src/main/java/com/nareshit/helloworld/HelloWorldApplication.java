package com.nareshit.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //here no need to have web.xml etc for despatcher servlet,webapplicaton context etc.
/*it means this class is called as bootstrap class,means this class is a starting point of the project,
   every spring boot project should have one one bootstrap class*/
public class HelloWorldApplication {

	public static void main(String[] args) {
		/*
		 * for every web application, WebApplicationContext will be required,
		 * but in spring boot by default WebApplicationContext will be created by framework
		 * 
		 * example of main package and sub packages
		 *   com.nareshit.helloworld ..........this is main package
		 *   com.nareshit.helloworld.controller...this is sub package to the helloworld package
		 *   com.nareshit.helloworld.service...this is also a sub package to the helloworld package
		 *   com.nareshit.helloworld.inventory...this is also a sub package to the helloworld package
		 *   com.nareshit.helloworld.cart...this is also a sub package to the helloworld package
		 * 
		 * */
		SpringApplication.run(HelloWorldApplication.class, args);  
		//first argument is this class name only,second args is for commandline argumens purpose
		
	}

}
