package com.atguigu.spring.beanscollections;

import java.util.Map;

import com.atguigu.spring.beans.Car;

public class NewPerson {
	private String name;
	private int age;
	private Map<String,Car> cars;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "NewPerson [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}
	
	
	
	
}
