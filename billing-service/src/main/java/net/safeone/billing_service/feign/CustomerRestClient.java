package net.safeone.billing_service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.web.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import net.safeone.billing_service.model.Customer;

@FeignClient(name= "customer-service")
public interface CustomerRestClient {

    @GetMapping("/api/customers/{id}")
    Customer getCustomerById(@PathVariable Long id);

    @GetMapping("/api/customers")
    PagedModel<Customer> getAllCustomers();

    
} 
