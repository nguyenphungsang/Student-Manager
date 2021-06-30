package sinhvien;

public class School {
	private String name;
	private Student[] students;
	private Teacher[] teachers;
	
	public School(String name, Student[] students, Teacher[] teachers) {
		this.name = name;
		this.students = students;
		this.teachers = teachers;
	}

	public int totalFee() {
		int total = 0;
		for(Student s: students)
			total += s.calculateFee();
		return total;
	}
	
	public int averageFee() {
		return totalFee()/students.length;
	}
	
	public int totalPaid() {
		int total = 0;
		for(Student s: students)
			total += s.paid;
		return total;
	}
	
	public int result() {
		int totalSalary = 0;
		for(Teacher t: teachers)
			totalSalary += t.salary;
		return totalFee() - totalSalary;
	}
	
	public void print() {
		System.out.println("Ten truong: " + this.name);
		System.out.println("Tong hoc phi: " + this.totalFee());
		System.out.println("Trung binh hoc phi: " + this.averageFee());
		System.out.println("Hoc phi da nop: " + this.totalPaid());
		System.out.println("Loi nhuan: " + this.result());
		System.out.println("-----------------------");
		System.out.println("Danh sach giao vien: ");
		for(Teacher t: teachers) {
			t.print();
			System.out.println("-----------------------");
		}
		System.out.println("Danh sach sinh vien: ");
		for(Student s: students) {
			s.print();
			System.out.println("-----------------------");
		}
	}
}
