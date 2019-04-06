package com.atguigu.spring.beans.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("before:" + bean + "," + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("after:" + bean + "," + beanName);
		// 这两个处理Bean的方法是全局的，所以，通常我们需要指定要处理的Bean
		if ("car".equals(beanName)) {
			Car car = (Car) bean;
			car.setBrand("BMW");
		}
		return bean;
	}

}
