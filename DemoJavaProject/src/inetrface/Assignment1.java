package inetrface;

interface collegename {
	void showcol(String s);
}

interface areacode {
	void showareacode(int n);
}

interface universityname {
	void showuni(String s);
}

interface feedetails extends collegename, areacode, universityname {
	void showfee(int n);
}

class showall implements feedetails {
	public void showcol(String s) {
		System.out.println("College : " + s);
	}

	public void showareacode(int n) {
		System.out.println("Area Code : " + n);
	}

	public void showuni(String s) {
		System.out.println("University : " + s);
	}

	public void showfee(int n) {
		System.out.println("Fees : " + n);
	}
}

public class Assignment1 {
	public static void main(String[] args) {
		showall o = new showall();
		o.showcol("Presidency");
		o.showuni("Presidency University");
		o.showareacode(560079);
		o.showfee(100000);
	}
}
