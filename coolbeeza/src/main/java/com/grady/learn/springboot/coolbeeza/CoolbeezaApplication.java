package com.grady.learn.springboot.coolbeeza;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.grady.learn.springboot.coolbeeza.dbo.StudentDAO;
import com.grady.learn.springboot.coolbeeza.entity.Student;

@SpringBootApplication
public class CoolbeezaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoolbeezaApplication.class, args);
	}

	// from the spring boot framework
	// Executed after the Spring Bean have been loaded
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		// Java lambda expression
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		Student stu = new Student("Grady", "Liu", "grady0902@gmail.com");

		// save the student object
		studentDAO.saveStudent(stu);

		// display id of the save student
		System.out.println("Student saved with id: " + stu.getId());
	}

}
