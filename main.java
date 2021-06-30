package sinhvien;

public class main {
	public static void main(String args[]) {
		Teacher t1 = new Teacher("1", "An", 30000000);
		Teacher t2 = new Teacher("2", "Binh", 50000000);
		Student s1 = new SVCQ("3", "Chi", 20);
		s1.pay(10000000);
		Student s2 = new SVCH("4", "Dung", 18);
		s2.pay(10000000);
		Student s3 = new SVLT("5", "Huy", 17);
		Student s4 = new SVTC("6", "Dat", 16);
		Student s5 = new SVCQ("7", "Tung", 18);
		Student[] students = new Student[] {s1, s2, s3, s4, s5};
		Teacher[] teachers = new Teacher[] {t1, t2};
		School s = new School("DHGTVT", students, teachers);
		s.print();
	}
	
}
