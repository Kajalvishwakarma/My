package info;

public class Pojo {
	String name;
	int id;
	int salary;
	public Pojo(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Pojo [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

//	void method() {
//		System.out.println(name+" "+id+" "+salary);
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pojo ob = new Pojo("Kajal",1111,120000);
		System.out.println(ob);
	}

}
