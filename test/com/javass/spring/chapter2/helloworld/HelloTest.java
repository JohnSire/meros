package com.javass.spring.chapter2.helloworld;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javass.spring.HelloApi;

public class HelloTest {

	@Test
	public void testHelloWorld() {
		// 1.读取配置文件实例化一个IoC容器
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"chapter2/helloworld.xml");
		// 2.从容器中获取Bean，面向接口编程
		HelloApi helloApi = context.getBean("hello", HelloApi.class);
		helloApi.sayhello();
	}
}
