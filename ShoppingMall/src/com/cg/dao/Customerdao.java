package com.cg.dao;

import com.cg.entities.Customer;

public interface Customerdao 
{
	
	public abstract Customer  addCustomer(Customer  customer);
	public abstract Customer  updateCustomer(Customer customer) ;
	public abstract Customer  searchCustomer(long  cust_id);
	public abstract boolean deleteCustomer(long  cust_id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
	


}
