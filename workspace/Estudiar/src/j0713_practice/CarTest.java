package j0713_practice;

import java.util.ArrayList;

public interface CarTest {
	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Sonata());
	}

}

abstract class Car {

}

class Sonata extends Car {
}