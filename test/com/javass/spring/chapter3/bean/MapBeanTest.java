package com.javass.spring.chapter3.bean;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapBeanTest {

	@Test
	public void test(){
		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				"chapter3/listInject.xml");
		MapTestBean bean = beanFactory.getBean("mapBean", MapTestBean.class);
		System.out.println(bean.getValues().size());
		
	}
	
}
