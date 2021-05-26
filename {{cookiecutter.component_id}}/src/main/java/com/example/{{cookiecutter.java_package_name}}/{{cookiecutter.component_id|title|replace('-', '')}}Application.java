package com.example.{{cookiecutter.java_package_name}};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class {{cookiecutter.component_id|title|replace('-', '')}}Application {

	public static void main(String[] args) {
		SpringApplication.run({{cookiecutter.component_id|title|replace('-', '')}}Application.class, args);
	}

}
