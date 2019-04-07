package com.atguigu.spring.beans.annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.atguigu.spring.beans.annotation.TestObject;

@Repository
public class UserRepositoryImpl implements UserRepository {
	@Autowired(required=false)//当容器中没有对应Bean的时候输出null，而不是报错
	private TestObject testObject;

	@Override
	public void save() {
		System.out.println("UserRepository save...");
		System.out.println(testObject);

	}

}
