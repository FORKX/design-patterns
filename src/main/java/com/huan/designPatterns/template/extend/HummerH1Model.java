package com.huan.designPatterns.template.extend;

public class HummerH1Model extends HummerModel {
	
	private boolean alarmFlag = true;
	
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

	
	protected boolean isAlarm() {
		return this.alarmFlag;
	}
	
	public void setAlarmFlag(boolean alarmFlag) {
		this.alarmFlag = alarmFlag;
	}

}
