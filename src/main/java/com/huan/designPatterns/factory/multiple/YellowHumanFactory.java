package com.huan.designPatterns.factory.multiple;

import com.huan.designPatterns.factory.Human;
import com.huan.designPatterns.factory.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new YellowHuman();
	}

}
