package com.atguigu.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.beans.collections.DataSource;
import com.atguigu.spring.beans.collections.NewPerson;
import com.atguigu.spring.beans.collections.Person;

public class Main2 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person p3=(Person) ctx.getBean("person3");
		System.out.println(p3);
		
		NewPerson p4=(NewPerson) ctx.getBean("person4");
		System.out.println(p4);
		
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource.getProperties());
		
		Person p5=(Person) ctx.getBean("person5");
		System.out.println(p5);
		
		Person p6=(Person) ctx.getBean("person6");
		System.out.println(p6);
	}

}
