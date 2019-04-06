package com.atguigu.spring.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean-autowired.xml");
		Person person = ctx.getBean(Person.class);
		System.out.println(person);
		
	}
}
