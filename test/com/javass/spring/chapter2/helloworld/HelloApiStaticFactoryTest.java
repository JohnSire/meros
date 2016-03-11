package com.javass.spring.chapter2.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javass.spring.HelloApi;

public class HelloApiStaticFactoryTest {

	@Test
	public void testBeanFactory() {
		// 使用静态工厂方法
		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				"chapter2/instantiatingBean.xml");
		HelloApi bean = beanFactory.getBean("staticFactory", HelloApi.class);
		bean.sayhello();
	}
}
