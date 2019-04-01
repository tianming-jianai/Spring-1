package com.atguigu.spring.beans;

public class Helloworld {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void hello() {
		System.out.println("helloworld:" + name);
	}
}
