package com.model;

import org.junit.Test;

import com.base.UnitTestBase;

public class ModelTest extends UnitTestBase{

	public ModelTest() {
		super("classpath:spring-model.xml");
	}
	
	@Test
	public void test(){
		Users bean = super.getBean("userAction");
		System.out.println(bean.getUsername());
	}
	
	
}
