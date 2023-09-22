package inetrface;

interface collegename1 {
	void showcol(String s);
}

interface Area extends collegename1 {
	void showareacode(int n);
}

interface universityname1 extends Area {
	void showuni(String s);
}

interface feesdetails extends collegename1 {
	void showfee(int n);
}

class showallcol implements feesdetails {
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
class showallcol1 implements universityname1 {
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


public class Assignment4 {

	public static void main(String[] args) {

		showallcol o = new showallcol();
		o.showcol("presi");
		o.showuni("university");
		o.showareacode(562134);
		o.showfee(1000090);
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		showallcol1 o1 = new showallcol1();
		o1.showcol("presi");
		o1.showuni("university");
		o1.showareacode(562134);
		o1.showfee(1000090);
		
		
	}

}
