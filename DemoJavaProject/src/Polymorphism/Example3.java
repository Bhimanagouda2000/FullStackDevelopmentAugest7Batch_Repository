package Polymorphism;

abstract class Animal2 {
	abstract void AvgWeight();
}

class Elephant extends Animal2 {
	void AvgWeight() {
		String Name = "Elephant";
		int weight = 20000;
		String name1 = "male";
		System.out.println("Animal name: " + Name);
		System.out.println("Animal Type: " + name1);
		System.out.println("Average Weight : " + weight + " Kg");
		System.out.println();
	}
}

class Dog1 extends Animal2 {
	void AvgWeight() {
		String Name = "Dog";
		int weight = 200;
		String name1 = "female";
		System.out.println("Animal name: " + Name);
		System.out.println("Animal Type: " + name1);
		System.out.println("Average Weight : " + weight + " Kg");
		System.out.println();
	}
}

class cat1 extends Animal2 {

	void AvgWeight() {
		String Name = "cat1";
		int weight = 106;
		String name1 = "male";
		System.out.println("Animal name: " + Name);
		System.out.println("Animal Type: " + name1);
		System.out.println("Average Weight : " + weight + " Kg");
		System.out.println();
	}
}

public class Example3 {

	public static void main(String[] args) {
		Animal2 ani = null;

		Elephant a = new Elephant();
		Dog1 m = new Dog1();
		cat1 o1 = new cat1();

		ani = a;
		ani.AvgWeight();

		ani = m;
		ani.AvgWeight();

		ani = o1;
		ani.AvgWeight();
	}
}
