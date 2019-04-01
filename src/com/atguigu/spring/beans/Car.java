package com.atguigu.spring.beans;

public class Car {
	private String brand;
	private String corp;
	private int price;
	private double maxSpeed;
	
	

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Car(String brand, String corp, int price) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
	}
	
	

	public Car(String brand, String corp,  double maxSpeed) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.maxSpeed = maxSpeed;
	}



	@Override
	public String toString() {
		return "Car [brand=" + brand + ", corp=" + corp + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void setCorp(String corp) {
		this.corp = corp;
	}
}
