package com.javass.spring.chapter2.helloworld;

import com.javass.spring.HelloApi;

public class HelloApiStaticFactory {

	// 工厂方法
	public static HelloApi newInstance(String first, String second) {
		// 返回需要的Bean实例
		return new HelloImpl2(first, second);
	}
}
