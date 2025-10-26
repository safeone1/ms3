package net.safeone.inventory_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.safeone.inventory_service.entities.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
