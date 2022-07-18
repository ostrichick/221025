package j0718;

class Car {
	String name;

	public Car() {
	}

	public Car(String name) {
		this.name = name;
	}

}

public class CarTest {
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car sonata1 = factory.createCar("연수 차");
		Car sonata2 = factory.createCar("연수 차");
		System.out.println(sonata1 == sonata2); // ture

		Car avante1 = factory.createCar("승연 차");
		Car avante2 = factory.createCar("승연 차");
		System.out.println(avante1 == avante2); // true

		System.out.println(sonata1 == avante1); // false
	}
}

class CarFactory {
	public void createCar(String name) {
	}
}