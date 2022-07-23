package com.MobileShop.Service.impl;

import java.util.List;
import java.util.Optional;

import com.MobileShop.Entity.Customer;
import com.MobileShop.Exception.MobileNotFoundException;
import com.MobileShop.Repository.CustomerRepository;
import com.MobileShop.Service.CustomerService;

import org.springframework.stereotype.Service;
@Service
public class CustomerServiceimpl implements CustomerService {

	private CustomerRepository customerRepository;

	public CustomerServiceimpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAllEMployees() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	

	@Override
	public Customer getCustomerById(long mobilenum) {
		/*Optional<Customer> customer= customerRepository.findById(mobilenum);
		if(customer.isPresent())
		{
			return customer.get();
		}else {
			throw new MobileNotFoundException("Customer", "mobileNum", mobilenum);
		}*/
		
		
		
		// by using lamda expression
		
		return customerRepository.findById(mobilenum).orElseThrow(
									() -> new MobileNotFoundException("Customer", "mobilenum", mobilenum));
			
	}

	@Override
	public Customer updateCustomer(Customer customer, long mobilenum) {
		// check whether the customer existing in DB or not
		Customer existingCustomer = customerRepository.findById(mobilenum).orElseThrow(
				()-> new MobileNotFoundException("Customer", "mobilenum", mobilenum));
		
		existingCustomer.setMobileNum(customer.getMobileNum());
		existingCustomer.setBrand(customer.getBrand());
		existingCustomer.setCustName(customer.getCustName());
		existingCustomer.setImeiNum(customer.getImeiNum());
		
		return existingCustomer;
	}

	@Override
	public void deleteByNum(long mobilenum) {
		// TODO Auto-generated method stub
		customerRepository.findById(mobilenum).orElseThrow(
				()-> new MobileNotFoundException("Customer", "mobilenum", mobilenum));
		
		customerRepository.deleteById(mobilenum);
	}
	
	//get all customer details
	
	

}
