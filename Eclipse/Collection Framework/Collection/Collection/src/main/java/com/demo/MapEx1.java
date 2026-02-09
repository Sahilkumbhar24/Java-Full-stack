package com.demo;

import java.util.*;
import java.util.Map.Entry;

public class MapEx1{
	public static void main(String args[]) {
		Map<Character,String> m = new LinkedHashMap();
		m.put('E', "elephant");
		m.put('R', "razor");
		m.put('a', "apple");
		m.put(null, "nothing");
		m.put('T', "tripod");
		m.put('s', "sky");
		m.put('c', "champion");
		m.put('q', "queen");
		System.out.println(m);
		System.out.println(m.get('T'));
		System.out.println(m.containsKey('T'));
		System.out.println(m.containsValue("queen"));
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		
		
		//Output
//		{E=elephant, R=razor, a=apple, null=nothing, T=tripod, s=sky, c=champion, q=queen}
//		tripod
//		true
//		true
//		8
//		false
		
		
		//Different typs to print key:value
		//1)
		Set<Character>set = m.keySet();
		System.out.println(set);
		for(Character c :set) {
			System.out.println(c+"\t\t"+m.get(c));
		}
		
		//output
//		[E, R, a, null, T, s, c, q]
//				E		elephant
//				R		razor
//				a		apple
//				null		nothing
//				T		tripod
//				s		sky
//				c		champion
//				q		queen

		//2)
		Set<Entry<Character,String>> e= m.entrySet();
		for(Entry<Character,String>e1:e) {
			System.out.println(e1.getKey()+"\t\t"+e1.getValue());
		}
		
		//Output
//		E		elephant
//		R		razor
//		a		apple
//		null		nothing
//		T		tripod
//		s		sky
//		c		champion
//		q		queen
		
		//3)
		Collection<String>c = m.values();
		for(String s:c) {
			System.out.println(s);
		}
		
		//output
//		elephant
//		razor
//		apple
//		nothing
//		tripod
//		sky
//		champion
//		queen

	}
}