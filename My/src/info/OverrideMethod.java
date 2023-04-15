package info;

class Parent{
	void method(int a, int b) {
		System.out.println(a+b);
	}
}
class Child extends Parent{
	void method(int a, int b) {
		System.out.println(a*b);
	}
}

public class OverrideMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj1 = new Parent();
		obj1.method(10, 20);
		Child obj2 = new Child();
		obj2.method(10, 20);
	}

}
