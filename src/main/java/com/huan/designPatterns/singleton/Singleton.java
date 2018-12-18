package com.huan.designPatterns.singleton;
/**
 * 单例
 * @author huan1
 *
 */
public class Singleton {
	
	private static final Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
	
	public static void someMethod() {
		System.out.println("this is singleton mode");
	}
	
}
