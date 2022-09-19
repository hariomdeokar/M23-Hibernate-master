package com.cg.client;

//import com.cg.entities.Admin;
import com.cg.entities.Customer;
//import com.cg.entities.Employee;
import com.cg.entities.Orders;
//import com.cg.entities.Shop;
//import com.cg.entities.User;
import com.cg.service.Customerservice;
import com.cg.service.CustomerserviceImpl;
//import com.cg.service.EmployeeService;
//import com.cg.service.EmployeeServiceImpl;
import com.cg.service.Orderservice;
import com.cg.service.OrderserviceImpl;
//import com.cg.service.ShopService;
//import com.cg.service.ShopServiceImpl;
//import com.cg.service.UserService;
//import com.cg.service.UserServiceImpl;

public class Client 
{
	


	public static void main(String[] args) 
	{
		
		
		/*User user = new User();
		UserService userService = new UserServiceImpl();
		user.setUser_Id(116);
		user.setName("hariom");
		user.setType("System User");
		user.setPassword("1234");
		
		Admin admin = new Admin();
		admin.setAdmin_id(17);
		admin.setName("Devyani");
		admin.setPassword("4444");
		admin.setPhone("216835284");
		
		user.setAdmin(admin);
		
		
		userService.addNewUser(user);
		
		

		Shop shop= new Shop();
		ShopService shopService = new ShopServiceImpl();
		shop.setShop_Id(12);
		shop.setShopCategory("Grocery");
		shop.setShopname("Ambika");
		shop.setShopstatus("Too Good");
		shop.setLeaseStatus("100");
		
		Employee  employee = new Employee();
		EmployeeService employeeService = new EmployeeServiceImpl();
		employee.setEmp_id(1);
		employee.setName("Gaurav");
		employee.setLocalDate(12);
		employee.setSalary(30000);
		employee.setDesignation("Manager");
		
	    employeeService.updateEmployee(employee);
		shopService.updateShop(shop);*/
		
		
		
		Customer customer = new Customer();
		Customerservice customerservice=new CustomerserviceImpl();
		customer.setCust_id(10);
		customer.setName("gaurav");
		customer.setEmail("abc@gmail.com");
		customer.setPhone("23773800");
		
		
		Orders order =new Orders();
		Orderservice orderservice =new OrderserviceImpl();
		order.setOrder_id(1);
		order.setDateOfPurchase(null);
		order.setTotal(100);
		order.setPaymentMode("cash");
		
		orderservice.addOrders(order);
		customerservice.addCustomer(customer);
		System.out.println("Data Is Inserted");
}
}