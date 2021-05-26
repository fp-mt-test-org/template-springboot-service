package com.example.{{ cookiecutter.java_package_name }};

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class {{cookiecutter.component_id|title|replace('-', '')}}ApplicationTests {

	@Test
	void contextLoads() {
	}

}
