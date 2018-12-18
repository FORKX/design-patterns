package com.huan.designPatterns.singleton;

import org.junit.Test;

public class NotSafeSingletonTest {

	@Test
	public void test() {

		for (int i = 0; i < 5; i++) {
			NotSafeSingleton notSafeSingleton = NotSafeSingleton.getSingleton();
			System.out.println(notSafeSingleton);
		}
	}

}
