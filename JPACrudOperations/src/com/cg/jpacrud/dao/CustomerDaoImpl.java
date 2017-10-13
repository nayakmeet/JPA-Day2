package com.cg.jpacrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.jpacrud.entities.Customer;
import com.cg.jpacrud.entities.Student;


public  class CustomerDaoImpl 
{

	private EntityManager entityManager;

	public CustomerDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	

	public void addCustomer(Customer customer) {			//CustomerClient is out pojo class.
		entityManager.persist(customer);
	}
	
	public Customer getCustomerById(int id) {
		Customer customer = entityManager.find(Customer.class, id);
		return customer;
	}

	
	public List<Customer> getCustomerByMobile(String mobile) 
	{
		String qStr = "SELECT c FROM Customer c WHERE c.mobile= :mobno";
		TypedQuery<Customer> query = entityManager.createQuery(qStr, Customer.class);
		query.setParameter("mobno", mobile);
		List<Customer> mobList = query.getResultList();
		System.out.println(mobList);
		return  mobList;
	
	}
	
		
	public void beginTransaction() {							//this is common for all.It will always come.
		entityManager.getTransaction().begin();
	}

	public void commitTransaction() {							//this is common for all.It will always come.
		entityManager.getTransaction().commit();
	}


	public List<Customer> getAllCustomer() {
		Query query = entityManager.createNamedQuery("getAllCustomer");
		@SuppressWarnings("unchecked")
		List<Customer> custList = query.getResultList();
		return custList;
	}
	
	public void updateCustomer(Customer customer) {
		entityManager.merge(customer);
}
	public void removeCustomer(Customer customer) {
		entityManager.remove(customer);
	}


}

