package info;

//We are performing debugging 
//when we don't get the expected output....we perform debugging
//it has 4 important keys
//F5 = Step into a method
//F6 = Line by line execution
//F7 = Stepback
//F8 = Traverse
public class Deb {
	void sum(int a, int b) {
//		a = 10;
//		b = 20;
		System.out.println(a+b);
	}
	void mul(float x, double y) {
//		x = 12.2f;
//		y = 23.2;
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deb ob = new Deb();
		ob.sum(100,20);
		ob.mul(10.09f, 56.2);
	}

}
