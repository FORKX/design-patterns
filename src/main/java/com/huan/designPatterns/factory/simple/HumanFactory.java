package com.huan.designPatterns.factory.simple;

import com.huan.designPatterns.factory.Human;

public class HumanFactory {
	@SuppressWarnings("unchecked")
	public static <T extends Human>T createHuman(Class<T> c){
		Human human = null;
		try {
			human = (Human) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return (T) human;
	}
}
