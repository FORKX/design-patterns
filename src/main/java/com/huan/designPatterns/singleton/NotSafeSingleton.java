package com.huan.designPatterns.singleton;
/**
 * 线程不安全
 * @author huan1
 *
 */
public class NotSafeSingleton {
	
	private static NotSafeSingleton singleton = null;
	
	private NotSafeSingleton() {
		
	}
	/**
	 * 当高并发时 如果线程A正在new NotSafeSingleton()创建对象时，线程B在singleton==null判断时就会产生多个实例;
	 * 可使用synchronized关键字避免
	 * @return
	 */
	
	public static NotSafeSingleton getSingleton() {
		if(singleton==null) {
			singleton = new NotSafeSingleton();
		}
		return singleton;
	}
}
