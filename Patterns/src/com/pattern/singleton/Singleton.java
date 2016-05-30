package com.pattern.singleton;

/**
 * Description: patterns for singleton
 * All Rights Reserved.
 * @version 1.0  2016年5月30日 上午11:31:56  by 代鹏（daipeng.456@gmail.com）创建
 */
public class Singleton {
	
	private static volatile Singleton instance;
	
	private Singleton(){}
	
	private static Singleton getInstance(){
		if(null == instance){
			synchronized (Singleton.class) {
				if(null == instance){
					instance = new Singleton();
				}
				return instance;
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		for(int i=0; i<100; i++){
			Singleton s = Singleton.getInstance();
			System.out.println(i + " hashcode:" + s.hashCode());
		}
	}
	
}
