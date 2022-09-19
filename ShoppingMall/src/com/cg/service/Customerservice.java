package com.cg.service;

import com.cg.entities.Customer;



public interface Customerservice 
{
	
	public abstract Customer addCustomer(Customer customer);
	public abstract Customer updateCustomer(Customer customer);
	public abstract Customer searchCustomer(long cust_id);
	public abstract boolean deleteCustomer(long cust_id);
}