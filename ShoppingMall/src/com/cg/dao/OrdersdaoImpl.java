package com.cg.dao;

import javax.persistence.EntityManager;


import com.cg.entities.Orders;

public class OrdersdaoImpl implements Ordersdao
{
    private EntityManager em ;
    
    public  OrdersdaoImpl() {
    	super();
    	em=JPAUtil.getEntityManager();
    }

	@Override
	public Orders addOrders(Orders orders) {
		em.persist(orders);
		return orders;
	}

	@Override
	public Orders updateOrders(Orders orders) {
		em.merge(orders);
		return null;
	}

	@Override
	public Orders searchOrders(long Orders_id) {
		Orders orders = em.find(Orders.class,Orders_id);
		return orders;
	}

	@Override
	public boolean deleteOrders(long Orders_id) {
		em.remove(Orders_id);
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
