package com.javass.spring.chapter2.helloworld;

import com.javass.spring.HelloApi;

public class HelloApiInstanceFactory {

	public HelloApi newInstance(String first,String second){
		return new  HelloImpl2(first, second);
	}
}
