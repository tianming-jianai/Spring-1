package com.atguigu.spring.extendsbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.beansautowire.Address;
import com.atguigu.spring.beansautowire.Person;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-relation.xml");
		//Address address = (Address) ctx.getBean("address");
		//System.out.println(address);
		
		Address address2 = (Address) ctx.getBean("address2");
		System.out.println(address2);
		
		Address address3 = (Address) ctx.getBean("address3");
		System.out.println(address3);
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
	}
}
