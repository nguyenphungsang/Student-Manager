package sinhvien;

public class SVTC extends Student{
	public SVTC(String id, String name) {
		super(id, name);
	}
	
	public SVTC(String id, String name, int credit) {
		super(id, name, credit);
	}
	
	public int calculateFee() {
		return credit*400000;
	}
	
	public void print() {
		super.print();
		System.out.println("Kieu: Tai chuc");
	}
}
