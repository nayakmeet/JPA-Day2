package com.cg.jpacrud.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;




import com.cg.jpacrud.entities.Customer;
import com.cg.jpacrud.entities.Student;
import com.cg.jpacrud.service.CustomerServiceImpl;

public class CustomerClient {
	
	public static void main(String[] args) {
		CustomerServiceImpl service = new CustomerServiceImpl();
		

	List<Customer> beanList=new ArrayList<Customer>();
	/*
	bean.setCustId(9);
	bean.setCusName("Neha");
	bean.setMobile("924239867");
	bean.setEmail("n@gmail.com");
	bean.setDob(new Date());
	
	service.addCustomer(bean);
	
	System.out.println("Data Inserted.");
	*/
//bean = service.findCustomerById(2);

/*	beanList = service.getCustomerByMobile("924239867");
	for(Customer bean:beanList){
	System.out.print("ID:"+bean.getCustId());
	System.out.println(" Name:"+bean.getCusName());
	System.out.println(" Mobile:"+bean.getMobile());
	System.out.println(" Email:"+bean.getEmail());
	System.out.println(" Date:"+bean.getDob()); 
	}
*/	
	
	for(Customer cus:service.getAllCustomer()) 
	{
		System.out.println(cus);
	}
	
	Customer customer = new Customer();
	customer = service.findCustomerById(0);
	customer.setCusName("Govind");
	customer.setEmail("gp@gmail.com");
	customer.setMobile("9856742132");
	customer.setDob("28-OCT-2017");
	service.updateCustomer(customer);
	System.out.println("Updated.");
	
	customer = service.findCustomerById(8);
	service.removeCustomer(customer);
	System.out.println("Removed");
	
	}
}
