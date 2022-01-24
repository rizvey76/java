package com.dependency.injection;

public class Car {

	Engine engine;

	public Car(Engine engine) {
		this.engine=engine;
	}

	public void carStarted() {
		engine.startEngine();
	}
}
