package com.patterns.abstractfactory;

public class BFactory extends AbstractFactory {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new CarB();
	}

	@Override
	public Fruit createFruit() {
		// TODO Auto-generated method stub
		return new FruitB();
	}

	
}
