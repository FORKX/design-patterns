package com.huan.designPatterns.template;

public abstract class HummerModel {
	public abstract void start();
	public abstract void stop();
	public abstract void alarm();
	public abstract void engineBoom();
	//final 防止被覆写
	public final  void run() {
		this.start();
		this.engineBoom();
		this.alarm();
		this.stop();
	};
}
