package com.rsn.typerbackend;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEncryptableProperties
@SpringBootApplication
public class TyperBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TyperBackendApplication.class, args);
	}

}
