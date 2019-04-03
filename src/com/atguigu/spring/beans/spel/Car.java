package com.atguigu.spring.beans.spel;

public class Car {
	private String brand;
	private double price;
	//轮胎周长
	private double tyrePerimeter;
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setTyrePerimeter(double tyrePerimeter) {
		this.tyrePerimeter = tyrePerimeter;
	}
	
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", tyrePerimeter=" + tyrePerimeter + "]";
	}
	
	
}
