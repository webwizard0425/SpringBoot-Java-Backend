package com.rohit.PringJDBCDemo;

import com.rohit.PringJDBCDemo.model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PringJdbcDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.run(PringJdbcDemoApplication.class, args);

		Alien alien1 = context.getBean(Alien.class);

		alien1.setId(111);
		alien1.setName("Navin");
		alien1.setTech("Java");

		Alienrepo repo = context.getBean(Alienrepo.class);

		repo.save(alien1);

		System.out.println(repo.findAll());
	}
}