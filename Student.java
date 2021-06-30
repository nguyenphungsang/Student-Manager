package sinhvien;

public abstract class Student extends Person{
	protected int credit;
	protected int paid;
	
	public Student(String id, String name) {
		super(id, name);
	}
	
	public Student(String id, String name, int credit) {
		super(id, name);
		this.credit = credit;
	}
	
	public abstract int calculateFee();
	
	public int calculateDue() {
		return this.calculateFee() - this.paid;
	}
	
	public void pay(int amount) {
		this.paid += amount;
	}
	
	public void print() {
		System.out.println("Ma sinh vien: " + this.id);
		System.out.println("Ho va ten: " + this.name);
		System.out.println("So tin chi: " + this.credit);
		System.out.println("Hoc phi: " + this.calculateFee());
		System.out.println("Da nop: " + this.paid);
		System.out.println("Con no: " + this.calculateDue());
	}
}
