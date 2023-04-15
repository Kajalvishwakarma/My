package info;

//setter and getter are used to set and get the values 
public class Settergetter {
	String name;
	int rollno;
	int marks;
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Settergetter ob = new Settergetter();
		ob.setRollno(1111);
		System.out.println(ob.getRollno());
		ob.setName("Kajal");
		System.out.println(ob.getName());
		ob.setMarks(99);
		System.out.println(ob.getMarks());
	}

}
