package com.MobileShop.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="mobile_service")
public class Customer {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_MobileNumber")
	private long mobileNum;
	@Column(name="customer_Name", nullable = false)
	private String custName;
	@Column(name="mobile_brand")
	private String brand;
	@Column(name="IMIE_Number")
	private String imeiNum;

	public Customer() {

	}

	public Customer(long mobileNum, String custName, String brand, String imeiNum) {
		super();
		this.mobileNum = mobileNum;
		this.custName = custName;
		this.brand = brand;
		this.imeiNum = imeiNum;
	}

	public long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getImeiNum() {
		return imeiNum;
	}

	public void setImeiNum(String imeiNum) {
		this.imeiNum = imeiNum;
	}
	
	
	

	

}
