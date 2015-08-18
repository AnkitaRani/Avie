package com.spring.myapp.views.controllers;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.spring.myapp.dao.CorporationDAO;
import com.spring.myapp.dao.impl.CorporationDAOImpl;
import com.spring.myapp.models.Corporation;

@Controller
public class CorporationViewController {
	
	CorporationDAO cvc = new CorporationDAOImpl();
	
	 @RequestMapping(value="corporations", method=RequestMethod.GET)
	 public String listCorporation1() {
		 
		 return "listCorporation";//"redirect:listCorporation";
	 }
	 
	 @RequestMapping(value="listCorporation", method=RequestMethod.GET)
	 @ResponseBody
	 public String listCorporation() {
		 List<Corporation> corporations = cvc.listCorporation();
		 String temp = corporations.toString();
		 HashMap<String, Object> hm = new HashMap<String, Object>();
	        hm.put("corporations", corporations);
	        return new Gson().toJson(hm);
	 }
}
