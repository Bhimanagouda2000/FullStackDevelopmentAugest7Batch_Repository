package Polymorphism;

abstract class Animal {
	abstract void animalsound(); 
}

class dog extends Animal {
	public void animalsound() {
		System.out.println("The dog says : Bow Bow");
	}
}

class cat extends Animal {
	public void animalsound() {
		System.out.println("The cat says : Mew Mew");
	}
}

class Pig extends Animal {
	public void animalsound() {
		System.out.println("The Pig says : Wee Wee");
	}
}

public class Example1 {

	public static void main(String[] args) {

		Animal newanimal = null;

		dog newdog = new dog();
		cat newcat = new cat();
		Pig newpig = new Pig();

		newanimal = newdog;
		newanimal.animalsound();

		newanimal = newcat;
		newanimal.animalsound();

		newanimal = newpig;
		newanimal.animalsound();

	}

}
