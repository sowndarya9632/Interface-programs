package org;

class Jhon extends Employee implements Qspiders,Jspiders {

	@Override
	public void developApp() {
		System.out.println("Developing of Apps");
		
	}

	@Override
	public void testApp() {
		System.out.println("Testing Of Apps");
		
	}

	@Override
	void work() {
		System.out.println("Working");
		
	}
	
	public static void main(String[] args) {
		Jhon j = new Jhon();
		j.developApp();
		j.testApp();
		j.work();
		j.walk();
		
	}

}
