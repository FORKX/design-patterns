package com.huan.designPatterns.factory;

public class YellowHuman implements Human{

	public void getColor() {
		System.out.println("黄色皮肤");
	}

	public void say() {
		System.out.println("黄种人");
	}
}
