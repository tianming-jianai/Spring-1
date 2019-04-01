# Spring是什么？

![1553949751339](C:\Users\张世罡\AppData\Local\Temp\1553949751339.png)

Spring的源代码非常优秀，值的学习！！！

![1553949855617](C:\Users\张世罡\AppData\Local\Temp\1553949855617.png)

![1553949874150](C:\Users\张世罡\AppData\Local\Temp\1553949874150.png)



![1553949883660](C:\Users\张世罡\AppData\Local\Temp\1553949883660.png)



springsource-tool-suite-3.9.8.RELEASE-e4.9.0-updatesite.zip

![1553949959444](C:\Users\张世罡\AppData\Local\Temp\1553949959444.png)

# 配置Spring：

![1553949987963](C:\Users\张世罡\AppData\Local\Temp\1553949987963.png)

![1553949998923](C:\Users\张世罡\AppData\Local\Temp\1553949998923.png)

![1553950097799](C:\Users\张世罡\AppData\Local\Temp\1553950097799.png)



## 基于Xml的方式：

Java代码：

```java
package com.atguigu.spring.beans;

public class Helloworld {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void hello() {
		System.out.println("helloworld:" + name);
	}
}
```

[^新建applicationContext.xml]: 可以通过namespace添加链接

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:util="http://www.springframework.org/schema/util"
	xmlns:p="http://www.springframework.org/schema/p"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
		http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util-4.3.xsd">
</beans>
```



![1553950493141](C:\Users\张世罡\AppData\Local\Temp\1553950493141.png)

```xaml
<bean id="car2" class="com.atguigu.spring.beans.Car">
		<constructor-arg value="BMW" index="0"></constructor-arg>
		<!-- 如果字面值包含特殊字符，可以使用<![CDATA[]]>包裹起来 -->
		<!-- 属性值也可以使用value直接进行配置 -->
		<constructor-arg>
			<value><![CDATA[<shanghai^>]]></value>
		</constructor-arg>
		<constructor-arg value="50.0" type="double"></constructor-arg>
	</bean>
```

![1553950585428](C:\Users\张世罡\AppData\Local\Temp\1553950585428.png)

![1553950592194](C:\Users\张世罡\AppData\Local\Temp\1553950592194.png)

![1553950646255](C:\Users\张世罡\AppData\Local\Temp\1553950646255.png)



![1553950653084](C:\Users\张世罡\AppData\Local\Temp\1553950653084.png)

![1553950660426](C:\Users\张世罡\AppData\Local\Temp\1553950660426.png)

```xml
<!-- 配置Bean -->
	<!-- class:全类名, 通过反射的 方式在IOC，容器中创建Bean，所以要求bean中必须有无参的构造器  -->
	<bean id="hello2" class="com.atguigu.spring.beans.Helloworld">
		<property name="name" value="Spring"></property>
	</bean>
```

![1553950665843](C:\Users\张世罡\AppData\Local\Temp\1553950665843.png)

```xml
<!-- 通过构造器注入 -->
	<!-- 使用构造器注入属性值，可以指定参数的位置和参数的类型！以区分重载的构造器！ -->
	<bean id="car" class="com.atguigu.spring.beans.Car">
		<constructor-arg value="Audi" index="0"></constructor-arg>
		<constructor-arg value="shanghai" index="1"></constructor-arg>
		<constructor-arg value="100000" index="2"></constructor-arg>
	</bean>
```

![1553950671013](C:\Users\张世罡\AppData\Local\Temp\1553950671013.png)

![1553950676667](C:\Users\张世罡\AppData\Local\Temp\1553950676667.png)

![1553950683582](C:\Users\张世罡\AppData\Local\Temp\1553950683582.png)

![1553950690245](C:\Users\张世罡\AppData\Local\Temp\1553950690245.png)

![1553950696071](C:\Users\张世罡\AppData\Local\Temp\1553950696071.png)

![1553950701262](C:\Users\张世罡\AppData\Local\Temp\1553950701262.png)

![1553950707368](C:\Users\张世罡\AppData\Local\Temp\1553950707368.png)

