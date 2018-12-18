package com.huan.designPatterns.template.extend;

public class HummerH2Model extends HummerModel {

	@Override
	public void start() {
		System.out.println("H2 START");
	}

	@Override
	public void stop() {
		System.out.println("H2 STOP");
	}

	@Override
	public void alarm() {
		System.out.println("H2 ALARM");
	}

	@Override
	public void engineBoom() {
		System.out.println("H2 ENGINE BOOM BOOM");
	}

	protected boolean isAlarm() {
		return false;
	}
}
