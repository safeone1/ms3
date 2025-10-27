package net.safeone.billing_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.safeone.billing_service.entities.Bill;

public interface BillRepository extends JpaRepository<Bill,Long> {

}
