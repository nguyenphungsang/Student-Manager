package sinhvien;

public class SVLT extends Student{
	public SVLT(String id, String name) {
		super(id, name);
	}
	
	public SVLT(String id, String name, int credit) {
		super(id, name, credit);
	}
	
	public int calculateFee() {
		return credit*350000;
	}
	
	public void print() {
		super.print();
		System.out.println("Kieu: Lien thong");
	}
}
