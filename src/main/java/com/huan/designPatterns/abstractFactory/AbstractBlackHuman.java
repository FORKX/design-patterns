package com.huan.designPatterns.abstractFactory;

public abstract class AbstractBlackHuman implements Human{

	public void getColor() {
		System.out.println("black color");
	}

	public void say() {
		System.out.println("black human");
	}
	
}
