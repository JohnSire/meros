package com.javass.spring.chapter3.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javass.spring.HelloApi;

public class DependencyInjectTest {

	@Test
	public void testConstructorDependencyInjectTest() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				"chapter3/dependencyInject.xml");
		// 获取根据参数索引依赖注入的bean
		HelloApi byIndex = beanFactory.getBean("byIndex", HelloApi.class);
		byIndex.sayhello();
		
		//获取根据参数类型依赖注入的bean
		HelloApi byType = beanFactory.getBean("byType", HelloApi.class);
		byType.sayhello();
		
		//获取根据参数名称依赖注入的bean
		HelloApi byName = beanFactory.getBean("byName", HelloApi.class);
		byName.sayhello();
	}
}
