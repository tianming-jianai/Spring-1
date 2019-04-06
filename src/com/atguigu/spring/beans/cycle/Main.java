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
/*
 *  IOC容器中Bean的生命周期方法：Spring允许在Bean的生命周期的特定点执行定制的任务
 *  过程：
 *  1.通过构造器或工厂方法创建Bean的实例
 *  2.位Bean的属性设置值和对其他bean的引用
 *  3.调用Bean的初始化方法
 *  4.Bean可以使用了
 *  5.当容器关闭时，调用Bean的销毁方法
 *  在Bean的声明里设置init-method和destory-method属性，为Bean指定初始化和销毁方法。
 *  -- Car's Constructor...
	-- setBrand...
	-- init ...
		com.atguigu.spring.beans.cycle.Car@51081592
		四月 06, 2019 10:04:20 上午 org.springframework.context.support.AbstractApplicationContext doClose
		信息: Closing org.springframework.context.support.ClassPathXmlApplicationContext@2e817b38: startup date [Sat Apr 06 10:04:19 CST 2019]; root of context hierarchy
	-- destory ...
 */
/*
 * 添加Bean后置处理器后Bean的生命周期
 * 1.通过构造器或者工厂方法创建Bean的实例
 * 2.为Bean的属性设置值或其他Bean的引用
 * 3.将Bean实例传递给Bean的后置处理器的postProcessorBeforInitialization方法
 * 4.调用Bean的初始化方法
 * 5.将Bean实例传递给Bean的后置处理器的postProcessorAfterInitialization方法
 * 6.Bean可以使用了
 * 7.当容器关闭时，调用Bean的销毁方法
 * 
 */