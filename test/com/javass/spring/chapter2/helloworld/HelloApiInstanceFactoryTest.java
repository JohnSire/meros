package com.javass.spring.chapter2.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javass.spring.HelloApi;

public class HelloApiInstanceFactoryTest {

	@Test
	public void test() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				"chapter2/FactoryBean.xml");
		HelloApi bean = beanFactory.getBean("bean", HelloApi.class);
		bean.sayhello();
	}
}
