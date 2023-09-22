package inheritence;

class milk {
	String str;

	void show() {
		System.out.println("The Value of Parent class:" + str);
	}
}

class tea extends milk {
	String str;

	tea(String s1, String s2) {
		super.str = s1;
		this.str = s2;
	}

	void show2() {
		System.out.println("The Value of sub class:" + str);
	}

}

class coffee extends tea {
	String str;

	coffee(String s1, String s2, String s3) {
		super(s1, s2);
		this.str = s3;
	}

	void show3() {
		System.out.println("The Value of Second sub class:" + str);
	}

}

public class multileveltwo {
	public static void main(String[] args) {
		coffee o = new coffee("Tea", "Cofee", "LEmon Tea");
		o.show();
		o.show2();
		o.show3();

	}

}
