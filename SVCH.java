package sinhvien;

public class SVCH extends Student{
	public SVCH(String id, String name) {
		super(id, name);
	}
	
	public SVCH(String id, String name, int credit) {
		super(id, name, credit);
	}
	
	public int calculateFee() {
		return credit*500000;
	}
	
	public void print() {
		super.print();
		System.out.println("Kieu: Cao hoc");
	}
}
