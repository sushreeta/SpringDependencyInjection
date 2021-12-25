package com.springframework.springdependencyinjection;

import com.springframework.springdependencyinjection.controllers.ConstructorInjectedController;
import com.springframework.springdependencyinjection.controllers.MyController;
import com.springframework.springdependencyinjection.controllers.PropertyInjectedController;
import com.springframework.springdependencyinjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdependencyinjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringdependencyinjectionApplication.class, args); //returns application context
		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("------Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("------property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
