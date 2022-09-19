package com.cg.service;

import com.cg.dao.Customerdao;
import com.cg.dao.CustomerdaoImpl;
import com.cg.entities.Customer;


public class CustomerserviceImpl implements Customerservice
{
	
	private Customerdao dao;
	 public CustomerserviceImpl(){
		 super();
		 dao=new CustomerdaoImpl();
		 	 }

	@Override
	public Customer addCustomer(Customer customer) {
		dao.addCustomer(customer);
		dao.addCustomer(customer);
		dao.commitTransaction();
		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		dao.beginTransaction();
		dao.updateCustomer(customer);
		dao.commitTransaction();
		return null;
	}

	@Override
	public Customer searchCustomer(long cust_id) {
		Customer customer = dao.searchCustomer(cust_id);
		return customer;
	}

	@Override
	public boolean deleteCustomer(long cust_id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}