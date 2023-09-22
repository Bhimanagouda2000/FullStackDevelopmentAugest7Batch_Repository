package inheritence;

class milk1 {
	String str;

	void show(int x) {
		System.out.println("The Value of Parent class:" + x);

	}
}

class tea2 extends milk1 {
	String str;

	tea2(String s1, String s2) {
		super.str = s1;
		this.str = s2;
	}

	void show(int x) {
		System.out.println("The Value of sub class one:" + x);
		System.out.println(str);

	}

}

class coffee3 extends tea2 {
	String str;

	coffee3(String s1, String s2, String s3) {
		super(s1, s2);
		this.str = s3;
	}

	void show(int x) {
		System.out.println("The Value of Second sub class two:" + x);
		System.out.println(str);

	}

}

class coldcoffee extends coffee3 {
	String str;

	coldcoffee(String s1, String s2, String s3, String s4) {
		super(s1, s2, s3);
		this.str = s4;
	}

	void show(int x) {
		System.out.println("The Value of Second sub class three:" + x);
		System.out.println(str);

	}

}

public class multilevelthree {

	public static void main(String[] args) {
		coldcoffee c = new coldcoffee("Milk", "Tea", "Coffee","Jaggery");
		c.show(10);
		c.show(20);
		c.show(30);

	}

}
