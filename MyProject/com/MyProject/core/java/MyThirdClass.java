package com.MyProject.core.java;

import java.util.*;

public class MyThirdClass {
	
	
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		System.out.println("enter the element");

		list1.add("QUALITY");
		list1.add("System");
		list1.add("ssn");
		list1.add("hbefkbsk");

		int index = Collections.binarySearch(list1, "QUALITY");

		System.out.println("'QUALITY' is available at index: " + index);
	}

}
