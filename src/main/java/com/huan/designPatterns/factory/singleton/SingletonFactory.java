package com.huan.designPatterns.factory.singleton;

import java.lang.reflect.Constructor;

public class SingletonFactory {
	private static Singleton singleton;
	
	static {
		try {
			Class c = Class.forName(Singleton.class.getName());
			Constructor<Singleton> constructor = c.getDeclaredConstructor();
			constructor.setAccessible(true);
			singleton = constructor.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Singleton getSingleton() {
		return singleton;
	}
	
}
