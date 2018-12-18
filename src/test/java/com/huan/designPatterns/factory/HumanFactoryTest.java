package com.huan.designPatterns.factory;


import org.junit.Test;

public class HumanFactoryTest {

	@Test
	public void test() {
		AbstractHumanFactory humanFactory = new HumanFactory();
		
		YellowHuman yellowHuman = humanFactory.createHuman(YellowHuman.class);
		yellowHuman.say();
		yellowHuman.getColor();
		
		BlackHuman blackHuman = humanFactory.createHuman(BlackHuman.class);
		blackHuman.say();
		blackHuman.getColor();
		
		WhiteHuman whiteHuman = humanFactory.createHuman(WhiteHuman.class);
		whiteHuman.say();
		whiteHuman.getColor();
	}

}
