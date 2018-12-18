package com.huan.designPatterns.abstractFactory;

public abstract class AbstractWhiteHuman implements Human{

	public void getColor() {
		System.out.println("white color");
	}

	public void say() {
		System.out.println("white human");
	}
	
}
