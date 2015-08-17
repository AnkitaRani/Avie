package com.spring.myapp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.spring.myapp.models.Customer;
import com.spring.myapp.utils.HibernateUtil;

public interface CustomerDAO {

	public Customer createCustomer(Customer customer);
	public Customer readCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer deleteCustomer(Customer customer);
	public List<Customer> listCustomer();
}
