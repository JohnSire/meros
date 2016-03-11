package com.javass.spring.chapter3.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javass.spring.HelloApi;

public class StaticFactoryDependencyInjectTest {

	@Test
	public void test() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				"chapter3/staticFactoryDependencyInject.xml");
		HelloApi byIndex = beanFactory.getBean("byIndex", HelloApi.class);
		byIndex.sayhello();
		
		HelloApi byType = beanFactory.getBean("byType", HelloApi.class);
		byType.sayhello();
		
		HelloApi byName = beanFactory.getBean("byName", HelloApi.class);
		byName.sayhello();
		
	}
}
