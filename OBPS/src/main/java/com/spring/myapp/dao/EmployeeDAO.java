package com.spring.myapp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.spring.myapp.models.Employee;
import com.spring.myapp.utils.HibernateUtil;

public interface EmployeeDAO {

	public Employee createEmployee(Employee employee);
	public Employee readEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee deleteEmployee(Employee employee);
	public List<Employee> listEmployee();
}
