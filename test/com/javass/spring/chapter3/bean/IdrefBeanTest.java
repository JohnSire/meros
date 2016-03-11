package com.javass.spring.chapter3.bean;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IdrefBeanTest {

	@Test
	public void test() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				"chapter3/idRefInject.xml");
		IdRefTestBean bean = beanFactory.getBean("idrefBean1", IdRefTestBean.class);
		System.out.println(bean.getId());
	}
}
