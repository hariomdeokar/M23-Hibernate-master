package com.cg.service;


import com.cg.dao.Ordersdao;
import com.cg.dao.OrdersdaoImpl;
import com.cg.entities.Orders;

public class OrderserviceImpl implements Orderservice
{
	 private Ordersdao dao ;
	 public OrderserviceImpl(){
		 super();
		 dao = new OrdersdaoImpl();
		 
	 }

	@Override
	public Orders addOrders(Orders orders) {
		dao.beginTransaction();
		dao.addOrders(orders);
		dao.commitTransaction();
		return orders;
	}

	@Override
	public Orders updateShop(Orders orders) {
		dao.beginTransaction();
		dao.updateOrders(orders);
		dao.commitTransaction();
		return orders;
	}

	@Override
	public boolean deleteShop(long Shop_Id) {
		// TODO Auto-generated method stub
		return false;
	}

}
