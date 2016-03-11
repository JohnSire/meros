package com.javass.spring.chapter3.helloworld;

import com.javass.spring.HelloApi;

//静态工厂类
public class DependencyInjectByStaticFactory {

	public static HelloApi newInstance(String message, int index) {
		return new HelloImpl3(message, index);
	}
}
