package com.javass.spring.chapter3.bean;

import java.util.Collection;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetInjectTest {

	@Test
	public void test() {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				"chapter3/listInject.xml");
		CollectionTestBean bean = beanFactory.getBean("setBean",
				CollectionTestBean.class);
		System.out.println(bean.getValues().size());
		Assert.assertEquals(3, bean.getValues().size());
	}
}
