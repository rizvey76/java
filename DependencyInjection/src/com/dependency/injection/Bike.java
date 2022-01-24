package com.dependency.injection;

public class Bike {
	
Engine engine;

public Bike(Engine engine) {
	this.engine=engine;
}

public void bikeStarted() {
	engine.startEngine();
}

}
