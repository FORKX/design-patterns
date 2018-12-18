package com.huan.designPatterns.template.extend;

public abstract class HummerModel {
	public abstract void start();
	public abstract void stop();
	public abstract void alarm();
	public abstract void engineBoom();
	//final 防止被覆写
	 public final  void run() {
		this.start();
		this.engineBoom();
		if(this.isAlarm()) {
			this.alarm();
		}
		this.stop();
	};
	
	protected boolean isAlarm() {
		return true;
	}
}
