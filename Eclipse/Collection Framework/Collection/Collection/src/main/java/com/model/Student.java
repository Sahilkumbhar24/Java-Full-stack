package com.model;

public class Student { // for comparable ->  implements Comparable<Student> {
	private int id;
	private String name;
	private String city;
	private double percentage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", percentage=" + percentage + "]";
	}
	public Student(int id, String name, String city, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	//for comparable 
	
//	@Override
//	public int compareTo(Student o) {
//		//for number comparison
////		if(percentage>o.percentage) {
////			return 1;
////			
////		}else if(percentage<o.percentage) {
////			return -1;
////		}else {
////			return 0;
////		}
//		
//		//for string comparison
//		return name.compareTo(o.name);
//	}
	
	

}
