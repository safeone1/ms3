package net.safeone.inventory_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import net.safeone.inventory_service.repositories.ProductRepository;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ProductRepository prodRepo) {
		return args -> {
			prodRepo.save(net.safeone.inventory_service.entities.Product.builder()
			.name("Laptop")
			.description("Dell XPS 13")
			.price(999.99)
			.quantity(50)
			.build()
			);
			prodRepo.save(net.safeone.inventory_service.entities.Product.builder()
			.name("Smartphone")
			.description("iPhone 13")
			.price(799.99)
			.quantity(100)
			.build()
			);
			prodRepo.save(net.safeone.inventory_service.entities.Product.builder()
			.name("Headphones")
			.description("Sony WH-1000XM4")
			.price(349.99)
			.quantity(75)
			.build()
			);
			prodRepo.findAll().forEach(System.out::println);
		};
	}
}
