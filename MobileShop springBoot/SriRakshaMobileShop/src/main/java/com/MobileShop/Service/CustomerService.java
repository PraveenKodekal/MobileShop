package com.MobileShop.Service;

import java.util.List;

import com.MobileShop.Entity.Customer;

public interface CustomerService {
	
	 Customer saveCustomer(Customer customer);
	 List<Customer> getAllEMployees();
	 Customer getCustomerById(long mobilenum);
	 Customer updateCustomer(Customer customer, long mobilenum);
	 void deleteByNum(long mobilenum);

}
