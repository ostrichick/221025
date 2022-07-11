package j0710_practice;

public class Student_test {
	public static void main(String[] args) {
		Student s5 = new Student();
		System.out.println(Student.getSerialNum());
		System.out.println(s5.getStudentID());
		System.out.println(s5.getStudentCard());

		Student s6 = new Student();
		System.out.println(Student.getSerialNum());
		System.out.println(s6.getStudentID());
		System.out.println(s6.getStudentCard());
	}
}
