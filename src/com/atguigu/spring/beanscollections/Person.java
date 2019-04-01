package com.atguigu.spring.beanscollections;

import java.util.List;

import com.atguigu.spring.beans.Car;

public class Person {
	private String name;
	private int age;
	private List<Car> cars;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}
	
	
	
}
