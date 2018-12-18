package com.huan.designPatterns.template;

public class HummerH1Model extends HummerModel {

	@Override
	public void start() {
		System.out.println("H1 START");
	}

	@Override
	public void stop() {
		System.out.println("H1 STOP");
	}

	@Override
	public void alarm() {
		System.out.println("H1 ALARM");
	}

	@Override
	public void engineBoom() {
		System.out.println("H1 ENGINE BOOM BOOM");
	}

	

}
