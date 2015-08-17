package com.spring.myapp.views.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.myapp.dao.CorporationController;
import com.spring.myapp.models.Corporation;

@Controller
public class CorporationViewController {
	
	CorporationController cvc = new CorporationController();
	
	 @RequestMapping(value="corporations", method=RequestMethod.GET)
	 public String listCorporation1() {
		 
		 return "listCorporation";//"redirect:listCorporation";
	 }
	 
	 @RequestMapping(value="listCorporation", method=RequestMethod.GET)
	 public String listCorporation() {
		 List<Corporation> corporations = cvc.listCorporation();
		 String temp = corporations.toString();
		 return corporations.toString();
	 }
}
