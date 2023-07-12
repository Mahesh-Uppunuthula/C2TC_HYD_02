package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.classes.Car;

@SpringBootApplication
public class DemoSpringBootProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoSpringBootProjectApplication.class, args);

		Car myCar = context.getBean(Car.class);
		Car myCar1 = context.getBean(Car.class);
		System.out.println(myCar.showProof());
		System.out.println(myCar1.showProof());
	}
}
