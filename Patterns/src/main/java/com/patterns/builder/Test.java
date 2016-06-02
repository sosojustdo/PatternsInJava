package com.patterns.builder;

public class Test {

	public static void main(String[] args) {
		ConcreteBuilder builder =  new ConcreteBuilder();
		Director d = new Director(builder);
		d.construct();
		Product product = builder.getResult();
	}
	
}
