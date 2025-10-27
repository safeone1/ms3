package net.safeone.billing_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.safeone.billing_service.entities.ProductItem;

public interface ProductItemRepository extends JpaRepository<ProductItem,Long> {

}
