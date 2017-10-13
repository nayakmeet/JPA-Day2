package com.cg.jpacrud.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;




import java.util.Scanner;

import com.cg.jpacrud.entities.Customer;
import com.cg.jpacrud.entities.Student;
import com.cg.jpacrud.service.CustomerServiceImpl;

public class CustomerClient {
	
	static Customer bean = new Customer();
	public static void main(String[] args) {
		
	
		CustomerServiceImpl service = new CustomerServiceImpl();
		List<Customer> beanList=new ArrayList<Customer>();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
	/*
	bean.setCustId(9);
	bean.setCusName("Neha");
	bean.setMobile("924239867");
	bean.setEmail("n@gmail.com");
	bean.setDob(new Date());
	*/ 
	do
	{
	System.out.println("Enter the choice:\n"
	+"\n 1.Add Details\n"
	+"\n 2.Get Details by Id\n"
	+"\n 3.Get Details by Mobile Number\n"
	+"\n 4.Display All Details\n"
	+"\n 5.Update Data\n"
	+"\n 6.Remove Data\n"
	+"\n 7.get Count\n"
	+"\n 8.Exit");
	
	 choice=sc.nextInt();
	 
	 switch(choice)
	 {
	
	 case 1:
	System.out.println("Enter Id:");
	bean.setCustId(sc.nextInt());
	System.out.println("Enter Name:");
	bean.setCusName(sc.next());
	System.out.println("Enter Mobile:");
	bean.setMobile(sc.next());
	System.out.println("Enter Email:");
	bean.setEmail(sc.next());
	System.out.println("Enter Date:");
	bean.setDob(sc.next());
	service.addCustomer(bean);
	
	System.out.print("ID:"+bean.getCustId());
	System.out.println(" Name:"+bean.getCusName());
	System.out.println(" Mobile:"+bean.getMobile());
	System.out.println(" Email:"+bean.getEmail());
	System.out.println(" Date:"+bean.getDob()); 
	
	break;
	
	 case 2:
	
		System.out.println("Enter Id:");
		int id = sc.nextInt();
		bean = service.findCustomerById(4);
		System.out.println("Customer with enetered Id:"+bean);
		
	break;
	
	 case 3:
		
	System.out.println("Enter Mobile:");
	String mobile = sc.next();	
	beanList= service.getCustomerByMobile(mobile);
	for(Customer bean:beanList)
	{
	System.out.print("ID:"+bean.getCustId());
	System.out.println(" Name:"+bean.getCusName());
	System.out.println(" Mobile:"+bean.getMobile());
	System.out.println(" Email:"+bean.getEmail());
	System.out.println(" Date:"+bean.getDob()); 
	}
	break;
	
	 case 4:
	
	System.out.println("-------------------All Details--------------");	 
	for(Customer cus:service.getAllCustomer()) 
	{
		System.out.println(cus);
	}
	System.out.println("---------------------------------------------");	
	
	 case 5:
	
		 Customer customer = new Customer();
			customer = service.findCustomerById(0);
			customer.setCusName("Govind");
			customer.setEmail("gp@gmail.com");
			customer.setMobile("9856742132");
			customer.setDob("28-OCT-2017");
			service.updateCustomer(customer);
			System.out.println("Updated.");
			
	break;
	
	 case 6:
		 
			customer = service.findCustomerById(8);
			service.removeCustomer(customer);
			System.out.println("Removed");
			
		 
	break;
	
	 case 7:
		 long count=service.getCount();
		 System.out.println(count);
		 
	break;
		 
	 case 8:
		 System.exit(0);
		break;
		
	 }
}while(choice!=8);
}}
