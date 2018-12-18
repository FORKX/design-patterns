package com.huan.designPatterns.factory;

public class HumanFactory extends AbstractHumanFactory {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
//			System.out.println(c);
//			System.out.println(Class.forName(c.getName()));
			human = c.newInstance();
//			human = (T) Class.forName(c.getName()).newInstance();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T) human;
	}

}
