package com;

public class Tom implements Employee {

	@Override
	public void work() {
		System.out.println("Tom is Working");
	}

	public static void main(String[] args) {
		System.out.println("Employee id: "+Employee.id);
		Tom t = new Tom();
		t.work();
	}

}
