package com.atguigu.spring.beans.factory;

public class Car {
	private String brand;
	private String price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	

	public Car() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("no param construction");
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}

	public Car(String brand, String price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	
	

}
