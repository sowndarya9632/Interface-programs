package com;

class Mahindra implements Car {

	@Override
	public void  start() {
		System.out.println("Car Started");
	}

	@Override
	public void stop() {
		System.out.println("Car Stopped");
	}

	public static void main(String[] args) {
		Mahindra m = new Mahindra();
		m.start();
		m.stop();
	}

}
