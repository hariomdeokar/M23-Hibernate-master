package com.cg.dao;


import com.cg.entities.Orders;

public interface Ordersdao
{
	public abstract Orders addOrders(Orders orders);
	public abstract Orders updateOrders(Orders admin );
	public abstract Orders searchOrders(long Orders_id);
	public boolean deleteOrders(long Orders_id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();

}
