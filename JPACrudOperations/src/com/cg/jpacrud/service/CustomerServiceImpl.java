package com.cg.jpacrud.service;

import java.util.List;

import com.cg.jpacrud.dao.CustomerDaoImpl;
import com.cg.jpacrud.entities.Customer;
import com.cg.jpacrud.entities.Student;

public class CustomerServiceImpl {
	
	CustomerDaoImpl dao;
	
	public CustomerServiceImpl() {
		dao = new CustomerDaoImpl();
	}
	
	
	public void addCustomer(Customer customer) {
		dao.beginTransaction();
		dao.addCustomer(customer);
		dao.commitTransaction();
	}
		public Customer findCustomerById(int id) {
		//no need of transaction, as it's an read operation
		Customer customer  = dao.getCustomerById(id);
		return customer;
	}
	
		public List<Customer> getCustomerByMobile(String mobile) {
			
			return dao. getCustomerByMobile(mobile);
		}

		public List<Customer> getAllCustomer() {
			return dao.getAllCustomer();
		}
		
		public void updateCustomer(Customer customer) {
			dao.beginTransaction();
			dao.updateCustomer(customer);
			dao.commitTransaction();
}
		public void removeCustomer(Customer customer) {
			dao.beginTransaction();
			dao.removeCustomer(customer);
			dao.commitTransaction();
		}


		public long getCount() {
			
			return dao.getCount();
		}		
}
