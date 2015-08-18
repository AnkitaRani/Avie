package com.spring.myapp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.spring.myapp.models.CxCorporationCustomer;
import com.spring.myapp.utils.HibernateUtil;

public interface CxCorporationCustomerDAO {

	public CxCorporationCustomer createCxCorporationCustomer(CxCorporationCustomer cxCorporationCustomer);
	public CxCorporationCustomer readCxCorporationCustomer(CxCorporationCustomer cxCorporationCustomer);
	public CxCorporationCustomer updateCxCorporationCustomer(CxCorporationCustomer cxCorporationCustomer);
	public CxCorporationCustomer deleteCxCorporationCustomer(CxCorporationCustomer cxCorporationCustomer);
	public List<CxCorporationCustomer> listCxCorporationCustomer();

}
