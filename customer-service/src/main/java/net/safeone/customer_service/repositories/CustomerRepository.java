 package net.safeone.customer_service.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import net.safeone.customer_service.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByEmail(String email);
}
