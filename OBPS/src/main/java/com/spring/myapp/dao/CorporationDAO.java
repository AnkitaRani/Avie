package com.spring.myapp.dao;

import com.spring.myapp.models.Corporation;
import com.spring.myapp.utils.HibernateUtil;

import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

public interface CorporationDAO{

    public Corporation createCorporation(Corporation corporation);
    public Corporation readCorporation(Corporation corporation);
    public Corporation updateCorporation(Corporation corporation);
    public Corporation deleteCorporation(Corporation corporation);
    public List<Corporation> listCorporation();
}
