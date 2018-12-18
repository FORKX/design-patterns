package com.huan.designPatterns.abstractFactory;

import org.junit.Test;

public class HumanFactoryTest {

	@Test
	public void test() {
		HumanFactory humanFactory = new MaleFactory();
		Human human =humanFactory.createBlackHuman();
		human.say();
		human.getColor();
		human.getSex();
		HumanFactory humanFactory2 = new FemaleFactory();
		Human human2 = humanFactory2.createBlackHuman();
		human2.say();
		human2.getColor();
		human2.getSex();
		
	}

}
