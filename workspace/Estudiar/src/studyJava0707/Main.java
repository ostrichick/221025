package studyJava0707;

public class Main {

	public static void main(String[] args) {
		System.out.println(new A()); // new 생성자는 객체를 생성하고 그 주소값을 반환함
		A a = new A();

//		Computer com = new Computer();
//		System.out.println(com.color);
//		System.out.println(com.mainboard);
//		System.out.println(com.keyboard);
//		System.out.println(com.innerField);

//		객체 내부는 클래스 블럭 안쪽을 의미
//		클래스내부

		Person p1 = new Person("도봉순", "여자");
		// 매개변수 순서와 데이터타입에 주의.
		System.out.println(p1.name);
		System.out.println(p1.gender);

		// 오버로딩: 메소드나 생성자의 이름을 중복해서
		// 매개변수의 타입 순서 갯수를 다르게 여러개 선언하여 사용

		// 매개변수의 타입과 순서에 주의해서 호출
		Student s1 = new Student(304293, "김삼식", 50, 3, "서울시 도봉구");
		System.out.println(s1.studnetNum);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.classNum);
		System.out.println(s1.addr);
		System.out.println(s1);

		s1 = new Student(594824, "박춘삼", "부산시 연제구");
		System.out.println(s1.studnetNum);
		System.out.println(s1.name);
		System.out.println(s1.addr);
		System.out.println(s1);

		Student s2 = new Student();
		// 객체 외부에서 메소드 사용시 .를 사용하여 호출
		int s2Age = s2.returnAge();
		System.out.println(s2Age);
		System.out.println(s2.add());

		s2.printInfo();
		s2.printString("문자열을 받아 출력하는 메소드");

		s2.plusplus(3, 9);
//
//		
	}
}
