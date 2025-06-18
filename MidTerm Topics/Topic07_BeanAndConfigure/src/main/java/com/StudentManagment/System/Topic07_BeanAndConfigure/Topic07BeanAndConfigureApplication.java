package com.StudentManagment.System.Topic07_BeanAndConfigure;

import com.StudentManagment.System.Topic07_BeanAndConfigure.configure.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// In Spring, a Bean is just a normal Java object (a class) that is managed by the Spring container
// Some annotation @RestController -> @ResponseBody and @Controller, @Component , @Service @Repository
// bean are the class that is written under this annotations
// when annotations are given Spring create object automatically and stores in Ioc/Application context
// normally we write Car car = new Car(); But in IoC, you don’t create the object yourself. You tell Spring: “Hey, I need a Car.” Spring will inject the object into your class.
// IoC means you give control to Spring
// let’s say IoC is a design concept. The ApplicationContext is the actual implementation of that concept in Spring

@SpringBootApplication
public class Topic07BeanAndConfigureApplication implements CommandLineRunner {
	@Autowired
	private Car car;
	public static void main(String[] args) {
		SpringApplication.run(Topic07BeanAndConfigureApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		car.driving();
	}
}
