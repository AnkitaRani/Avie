package com.spring.myapp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.spring.myapp.models.Department;
import com.spring.myapp.utils.HibernateUtil;

public interface DepartmentDAO {

	public Department createDepartment(Department department);

	public Department readDepartment(Department department);

	public Department updateDepartment(Department department);

	public Department deleteDepartment(Department department);

	public List<Department> listDepartment();

}
