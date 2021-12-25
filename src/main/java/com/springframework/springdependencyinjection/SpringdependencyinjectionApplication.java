package com.springframework.springdependencyinjection;

import com.springframework.springdependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdependencyinjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringdependencyinjectionApplication.class, args); //returns application context
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
