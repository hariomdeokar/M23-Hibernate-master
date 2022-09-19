package com.cg.service;

import com.cg.entities.Orders;

public interface Orderservice 
{
	public abstract Orders addOrders(Orders orders);
    public abstract Orders updateShop(Orders orders);
	public abstract boolean deleteShop(long Shop_Id);

}
