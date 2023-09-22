package inetrface;

interface add {
	public static int a = 550;
	public static int b = 10;
	public static int c = 800;
	public static int d = 900;

	void add3();
}

class addition implements add {
	public void add3() {
		System.out.println("Addition of a,b,c,d : " + (a + b + c + d));
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		addition o = new addition();
		o.add3();
	}
}
