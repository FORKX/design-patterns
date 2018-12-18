package com.huan.designPatterns.template.extend;

import org.junit.Test;

public class HummerModelTest {

	@Test
	public void test() {
		HummerH1Model h1 = new HummerH1Model();
		h1.setAlarmFlag(false);
		h1.run();
		
		HummerModel h2 = new HummerH2Model();
		h2.run();
		
	}
	
	
	

}
