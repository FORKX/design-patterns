package com.huan.designPatterns.factory.singleton;

import org.junit.Test;

public class SingletonFactoryTest {

	@Test
	public void test() {
		Singleton singleton = SingletonFactory.getSingleton();
		
		Singleton singleton2 = SingletonFactory.getSingleton();
		
		System.out.println(singleton);
		System.out.println(singleton2);
	}

}
