package com.atguigu.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//Helloworld helloworld=new Helloworld();
		//helloworld.setName("梅梅");
		//helloworld.hello();
		//1.创建Sprig容器的IOC对象
		//ApplicationContext代表IOC容器
		//ClassPathXmlApplicationContext 是ApplicationContext的实现类，该实现类从类路径下来加载配置文件
		//SpringIOC容器
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Helloworld helloworld2 = (Helloworld) ctx.getBean("hello2");
		helloworld2.hello();
		
		Helloworld helloworld3= ctx.getBean(Helloworld.class);
		helloworld3.hello();
		
		Car car=(Car) ctx.getBean("car");
		System.out.println(car);
		
		
		Car car2=(Car) ctx.getBean("car2");
		System.out.println(car2);
		
		
		Person person =  (Person) ctx.getBean("person");
		System.out.println(person);
		
		
		Person person2 = (Person) ctx.getBean("person2");
		System.out.println(person2);
		
	}
}
