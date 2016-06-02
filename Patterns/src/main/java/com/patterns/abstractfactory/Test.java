package com.patterns.abstractfactory;

public class Test {
	
	public static void main(String[] args) {
		
		AbstractFactory factory = new AFactory();
		CarA carA = (CarA) factory.createCar();
		FruitA fruitA = (FruitA) factory.createFruit();
		
	}

}
