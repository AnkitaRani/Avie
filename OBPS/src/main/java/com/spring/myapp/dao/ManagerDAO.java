package com.spring.myapp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.spring.myapp.models.Manager;
import com.spring.myapp.utils.HibernateUtil;

public interface ManagerDAO {

	public Manager createManager(Manager manager);
	public Manager readManager(Manager manager);
	public Manager updateManager(Manager manager);
	public Manager deleteManager(Manager manager);
	public List<Manager> listManager();
}
