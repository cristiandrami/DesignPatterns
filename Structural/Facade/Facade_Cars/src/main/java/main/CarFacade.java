package main;

import cars.Bmw;
import cars.Car;
import cars.Ferrari;
import cars.Porsche;

public class CarFacade {
	private Car car;
	public CarFacade() {
		
	}
	
	public void printBmwInfo()
	{
		car= new Bmw();
		car.printInfo();
	}
	public void printFerrariInfo()
	{
		car= new Ferrari();
		car.printInfo();
	}
	public void printPorscheInfo()
	{
		car= new Porsche();
		car.printInfo();

	}
	
}
