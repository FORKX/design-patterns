package com.huan.designPatterns.factory.multiple;

import com.huan.designPatterns.factory.BlackHuman;
import com.huan.designPatterns.factory.Human;

public class BlackHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new BlackHuman();
	}

}
