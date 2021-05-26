package com.example.{{cookiecutter.component_id}};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class {{cookiecutter.component_id|title|replace('-', '')}}Application {

	public static void main(String[] args) {
		SpringApplication.run({{cookiecutter.component_id|title|replace('-', '')}}Application.class, args);
	}

}
