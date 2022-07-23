package com.MobileShop.Repository;

import com.MobileShop.Entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	
	

}
