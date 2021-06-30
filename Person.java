package sinhvien;

public class Person {
	protected String id;
	protected String name;
	
	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void print() {
		System.out.println("Ma: " + this.id);
		System.out.println("Ho va ten: " + this.name);
	}
}
