package com.javass.spring.chapter2.helloworld;

import com.javass.spring.HelloApi;

public class HelloImpl2 implements HelloApi {

	private String first;
	private String second;
	
	public HelloImpl2() {
		super();
	}
	

	public HelloImpl2(String first, String second) {
		super();
		this.first = first;
		this.second = second;
	}

	

	@Override
	public void sayhello() {
		System.out.println(first+" "+second);
	}

}
