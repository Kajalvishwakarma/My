package info;

//Method Overloading - A class having same methods with same name but with different parameters
class One{
	int m1(int a, int b) {
		return a+b;
	}
	double m1(double a, double b, double c) {
		return a+b+c;
	}
}

public class OverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One obj1 = new One();
		System.out.println(obj1.m1(1, 10));
		System.out.println(obj1.m1(10.4, 2.9, 2.09));
	}

}
