package com.MobileShop.Controller;

import java.util.List;

import com.MobileShop.Entity.Customer;
import com.MobileShop.Service.CustomerService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class CustomerController {
	
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	// to create rest api
	@PostMapping
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer)
	{
		return new ResponseEntity<Customer>(customerService.saveCustomer(customer), HttpStatus.CREATED);
	}
	
	// build all employee rest api
	@GetMapping
	public List<Customer> getAllEmployees(){
		return customerService.getAllEMployees();
	}

	// build get by customer ph num
	
	@GetMapping("{mobileNum}")
	public ResponseEntity<Customer> getEmployeeById(@PathVariable("mobileNum") long mobilenum){
		return new ResponseEntity<Customer>(customerService.getCustomerById(mobilenum), HttpStatus.OK);
		
	}
	@PutMapping("{mobilenum}")
	public ResponseEntity<Customer> updateEmployee(@PathVariable("mobilenum") long mobilenum, @RequestBody Customer customer){
		
		return new ResponseEntity<Customer>(customerService.updateCustomer(customer, mobilenum), HttpStatus.OK);
		
	}
	@DeleteMapping("{mobilenum}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("mobilenum") long mobilenum){
		 customerService.deleteByNum(mobilenum);;
		return new ResponseEntity<String>("deleted success", HttpStatus.OK);
	}
}
