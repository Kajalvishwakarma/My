package info;

public class Statictype {
	static String name;
	String classs;
	static int rollno;
	int marks;
	static void m1() {
		name = "Kajal";
		rollno = 1111;
		System.out.println(name+","+rollno);
	}
	void m2() {
		classs = "SYBSC CS";
		marks = 98;
		System.out.println(classs+","+marks);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statictype obj = new Statictype();
		obj.m2();
		Statictype.m1();
		System.out.println(Statictype.name);
		System.out.println(obj.classs);
	}

}
