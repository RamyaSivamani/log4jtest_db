package com.kgfsl.log4jtest;
public class Employee {

	private String id;
	private String name;
	private String age;
	private String country;

	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAge() {
		return age;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountry() {
		return country;
	}


	//@Override
	public String toString() {
		return "{" + id + "::" + name + "::" + age + "::" + country + "}";
	}
}
