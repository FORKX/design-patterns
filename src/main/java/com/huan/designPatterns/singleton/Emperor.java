package com.huan.designPatterns.singleton;

import java.util.ArrayList;
import java.util.Random;
/**
 * 有限的多例
 * @author huan1
 *
 */
public class Emperor {
	//最多实例的数量
	private static int maxNumOfEmperor = 2;
	//对象的名 私有属性
	private static ArrayList<String> nameList = new ArrayList<String>();
	//存在所有实例
	private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>();
	//当前实例序列号
	private static int countNumOfEmperor = 0;
	
	static {
		for (int i = 0; i < maxNumOfEmperor; i++) {
			emperorList.add(new Emperor("皇帝"+(i+1)));
		}
	}
	
	private Emperor() {
		
	}
	
	private Emperor(String name) {
		nameList.add(name);
	}
	
	public static Emperor getInstance() {
		Random random = new Random();
		countNumOfEmperor = random.nextInt(maxNumOfEmperor);
		return emperorList.get(countNumOfEmperor);
				
	}
	
	public  void say() {
		System.out.println(nameList.get(countNumOfEmperor));
	}
	
	
	
	
}
