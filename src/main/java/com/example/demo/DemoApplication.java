package com.example.demo;

import com.example.demo.annotation.NameOfClassProcessor;
import com.example.demo.dto.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Person person = new Person();
		String name = NameOfClassProcessor.toJson(person);
		System.out.println(name);

		SpringApplication.run(DemoApplication.class, args);
	}

}
