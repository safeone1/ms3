package net.safeone.customer_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import net.safeone.customer_service.entities.Customer;
import net.safeone.customer_service.repositories.CustomerRepository;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.save(Customer.builder()
			.name("safeone")
			.email("safeonekan@gmail.com")
			.build()
			);
			customerRepository.save(Customer.builder()
			.name("yassir")
			.email("yassir@gmail.com")
			.build()
			);
			customerRepository.save(Customer.builder()
			.name("asmaa")
			.email("asmaa@gmail.com")
			.build()
			);
			customerRepository.findAll().forEach(System.out::println);
		};
	}
}
