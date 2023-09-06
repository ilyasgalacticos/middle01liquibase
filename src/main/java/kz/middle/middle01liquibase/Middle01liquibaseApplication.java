package kz.middle.middle01liquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Middle01liquibaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(Middle01liquibaseApplication.class, args);
	}

}
