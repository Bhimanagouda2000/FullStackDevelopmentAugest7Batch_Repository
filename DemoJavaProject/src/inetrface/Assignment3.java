package inetrface;

interface empname {
	void showempname(String s);
}

interface depcode extends empname {
	void showdepcode(int n);
}

interface empno extends depcode {
	void showempno(int n);
}

class showallemp implements empno {
	public void showempname(String s) {
		System.out.println("Employee Nmae : " + s);
	}

	public void showdepcode(int n) {
		System.out.println("Department Code : " + n);
	}

	public void showempno(int n) {
		System.out.println("Employee no : " + n);
	}

}

public class Assignment3 {

	public static void main(String[] args) {
		showallemp o = new showallemp();
		o.showempname("Bhimanagouda");
		o.showdepcode(46);
		o.showempno(560098);

	}
}
