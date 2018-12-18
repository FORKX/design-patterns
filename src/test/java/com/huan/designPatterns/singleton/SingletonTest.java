package com.huan.designPatterns.singleton;

import org.junit.Test;

import junit.framework.TestCase;

public class SingletonTest extends TestCase {
	
	@Test
	public void testSingleton() {
		
		for (int i = 0; i < 3; i++) {
			Singleton singleton = Singleton.getInstance();
			System.out.println(singleton);
		}
	}
	
}
