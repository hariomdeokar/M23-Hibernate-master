package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Customer;

public class CustomerdaoImpl implements Customerdao
{
	 private EntityManager em ;
	    
	    public CustomerdaoImpl() {
	    	super();
	    	em=JPAUtil.getEntityManager();
	    }

	@Override
	public Customer addCustomer(Customer customer) {
		em.persist(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		em.merge(customer);
		return customer;
	}

	@Override
	public Customer searchCustomer(long cust_id) {
		Customer customer = em.find(Customer.class, cust_id);
		return customer;
	}

	@Override
	public boolean deleteCustomer(long cust_id) {
		em.remove(cust_id);
		return false;
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

	

}
