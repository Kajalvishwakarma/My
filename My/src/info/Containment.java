package info;

//having 2 class and wanna access only a selected methods of class 1 into class 2...aggregation and composition
//has-a and is-a
class P{
	void meth1(int a, double b) {
		System.out.println(a+b);
	}
	void meth2(int a, float b) {
		System.out.println(a*b);
	}
}
class C{
	P a = new P();
}

public class Containment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.a.meth1(19, 10.8);
	}

}
