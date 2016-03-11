package com.javass.spring.chapter3.bean;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListInjectTest {

	@Test
	public void test() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				"chapter3/listInject.xml");
		ListTestBean listBean = beanFactory.getBean("listBean",
				ListTestBean.class);
		System.out.println(listBean.getValues().size());
		Assert.assertEquals(3, listBean.getValues().size());
	}
}
