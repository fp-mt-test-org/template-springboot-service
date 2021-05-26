package com.example.{{ cookiecutter.component_id }};

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class {{cookiecutter.component_id|title|replace('-', '')}}ApplicationTests {

	@Test
	void contextLoads() {
	}

}
