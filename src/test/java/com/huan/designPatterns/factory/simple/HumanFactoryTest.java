package com.huan.designPatterns.factory.simple;

import org.junit.Test;

import com.huan.designPatterns.factory.BlackHuman;
import com.huan.designPatterns.factory.YellowHuman;

public class HumanFactoryTest {

	@Test
	public void test() {
		YellowHuman yellowHuman = HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.say();
		yellowHuman.getColor();
		
		BlackHuman blackHuman = HumanFactory.createHuman(BlackHuman.class);
		blackHuman.say();
		blackHuman.getColor();
		
	}

}
