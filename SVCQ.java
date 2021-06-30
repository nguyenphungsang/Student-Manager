package sinhvien;

public class SVCQ extends Student{
	public SVCQ(String id, String name) {
		super(id, name);
	}
	
	public SVCQ(String id, String name, int credit) {
		super(id, name, credit);
	}
	
	public int calculateFee() {
		return credit*300000;
	}
	
	public void print() {
		super.print();
		System.out.println("Kieu: Chinh quy");
	}
}
