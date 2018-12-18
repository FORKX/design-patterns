package com.huan.designPatterns.singleton;

import org.junit.Test;

public class EmperorTest {

	@Test
	public void test() {
		int ministerNum = 5;
		for (int i = 0; i < ministerNum; i++) {
			Emperor emperor = Emperor.getInstance();
			emperor.say();
		}
	}

}
