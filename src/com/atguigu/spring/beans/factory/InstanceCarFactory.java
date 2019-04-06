package com.atguigu.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 实例工厂方法：实例工厂的方法，即需要先创建工厂本身，再调用工厂实例方法来返回bean的实例
 * 
 * @author Login
 *
 */
public class InstanceCarFactory {

	private Map<String, Car> cars = null;

	public InstanceCarFactory() {
		super();
		cars = new HashMap<String, Car>();
		cars.put("changan", new Car("changan", "30000"));
		cars.put("audi", new Car("audi", "100000"));
	}

	public Car getCar(String brand) {
		return cars.get(brand);
	}

}
