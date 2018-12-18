package com.huan.designPatterns.factory.multiple;

import org.junit.Test;

import com.huan.designPatterns.factory.Human;

public class AbstractHumanFactoryTest {

	@Test
	public void test() {
		Human yellowHuman = new YellowHumanFactory().createHuman();
		yellowHuman.say();
		yellowHuman.getColor();
		
		Human whiteHuman = new WhiteHumanFactory().createHuman();
		whiteHuman.say();
		whiteHuman.getColor();
	}

}
