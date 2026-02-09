package com.model;

import java.util.Comparator;

public class StudentByCityDesc implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getCity().compareTo(o2.getCity());
	}

}
