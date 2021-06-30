package sinhvien;

public class Teacher extends Person{
	protected int salary;
	
	public Teacher(String id, String name) {
		super(id, name);
	}
	
	public Teacher(String id, String name, int salary) {
		super(id, name);
		this.salary = salary;
	}
	
	public void print() {
		System.out.println("Ma giao vien: " + this.id);
		System.out.println("Ho va ten: " + this.name);
		System.out.println("Luong: " + this.salary);
	}
}
