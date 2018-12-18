package com.huan.designPatterns.template;

import org.junit.Test;

public class HummerModelTest {

	@Test
	public void test() {
		HummerModel h1 = new HummerH1Model();
		h1.run();
		HummerH2Model h2 = new HummerH2Model();
		h2.run();
	}

}
