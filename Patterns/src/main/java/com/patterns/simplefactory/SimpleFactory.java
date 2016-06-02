package com.patterns.simplefactory;

public class SimpleFactory {
	
	public static Object createObject(String classType){
		if("a".equalsIgnoreCase(classType)){
			return new A();
		}else if("b".equalsIgnoreCase(classType)){
			return new B();
		}
		return null;
	}

}
