package com.demo;

import java.util.*;
import java.util.Map.Entry;

public class MapEx2{
	public static void main(String args[]) {
		Map<String,Set<String>> m = new HashMap();
		
		String q1 = "What is java?";
		Set<String>aq1 = new HashSet();
		aq1.add("Java is a virtual machine");
		aq1.add("Java is a programming language");
		aq1.add("Java is a operating system");
		aq1.add("Java is a device");
		m.put(q1, aq1);
		
		String q2 = "encapsulation can be used for?";
		Set<String>aq2 = new LinkedHashSet();
		aq2.add("to hide method");
		aq2.add("to show method");
		aq2.add("to call method");
		aq2.add("to hide data");
		m.put(q2, aq2);
		
		String q3 = "Polymorphism can be used for ?";
		Set<String>aq3 = new LinkedHashSet();
		aq3.add("execute method directly");
		aq3.add("execute method as per requirement");
		aq3.add("both a & b");
		aq3.add("none of these");
		m.put(q3, aq3);
		
		String q4 = "Array can be used to ?";
		Set<String>aq4 = new LinkedHashSet();
		aq4.add("store multiple values");
		aq4.add("store homogenous values");
		aq4.add("store heterogenous values");
		aq4.add("all of the above");
		m.put(q4, aq4);
		
		int q =0;
		Set<String> set = m.keySet();
		for(String s:set) {
			System.out.println("Q-" +(++q)+": "+s);
			char c='a';
			Set<String>ans=m.get(s);
			for(String a:ans) {
				System.out.println((c++)+") "+a);
			}
		}
		
		
	}
}	