package com.huan.designPatterns.abstractFactory;

public class FemaleFactory implements HumanFactory {

	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}

	public Human createWhiteHuman() {
		return null;
	}

}
