package com.javass.spring.chapter3.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javass.spring.HelloApi;

public class SetterDependencyInjectTest {

	@Test
	public void test() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				"chapter3/setterDependencyInject.xml");
		HelloApi bean = beanFactory.getBean("bean", HelloApi.class);
		bean.sayhello();
	}
}
