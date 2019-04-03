package com.atguigu.spring.beans.spel;

public class Person {
	private String name;
	private Car car;
	
	//引用Address的 city 属性
	private String city;
	
	//根据Car的price确定info: price > 300000 ？ 金领 ：白领
	private String info;

	public void setName(String name) {
		this.name = name;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + ", city=" + city + ", info=" + info + "]";
	}
	
}
