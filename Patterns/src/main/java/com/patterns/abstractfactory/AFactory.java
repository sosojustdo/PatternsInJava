package com.patterns.abstractfactory;

public class AFactory extends AbstractFactory {

	@Override
	public Car createCar() {
		return new CarA();
	}

	@Override
	public Fruit createFruit() {
		return new FruitA();
	}

	
}
