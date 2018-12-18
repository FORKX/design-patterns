package com.huan.designPatterns.factory.multiple;

import com.huan.designPatterns.factory.Human;
import com.huan.designPatterns.factory.WhiteHuman;

public class WhiteHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new WhiteHuman();
	}

}
