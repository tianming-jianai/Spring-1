package com.atguigu.spring.beans.cycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cycle.xml");

		Car car = (Car) ctx.getBean("car");
		System.out.println(car);

		// 关闭IOC容器
		ctx.close();
	}
}
