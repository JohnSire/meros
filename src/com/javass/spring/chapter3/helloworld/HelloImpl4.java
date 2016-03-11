package com.javass.spring.chapter3.helloworld;

import com.javass.spring.HelloApi;

public class HelloImpl4 implements HelloApi {

	private String message;
	private int index;

	public void setMessage(String message) {
		this.message = message;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public void sayhello() {
		System.out.println(index + ":" + message);
	}

}
