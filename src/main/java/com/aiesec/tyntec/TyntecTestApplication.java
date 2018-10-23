package com.aiesec.tyntec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ikbel benabdessamad 22/10/2018
 *
 */

@SpringBootApplication
@ComponentScan("com.aiesec.tyntec")
public class TyntecTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TyntecTestApplication.class, args);
	}

}
