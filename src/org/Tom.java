package org;

class Tom extends Hotel implements College,Theatre {

	@Override
	void eat() {
		System.out.println("Eating");
	}

	@Override
	public void watchMovie() {
		System.out.println("Watching Movie");
	}

	@Override
	public void study() {
		System.out.println("Studing Java");
	}
	public static void main(String[] args) {
		Tom t = new Tom();
		t.eat();
		t.study();
		t.watchMovie();
	}

}
