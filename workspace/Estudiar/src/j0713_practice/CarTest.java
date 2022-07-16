package j0713_practice;

import java.util.ArrayList;

public interface CarTest {
  public static void main(String[] args) {
    ArrayList<Car> carList = new ArrayList<Car>();
    // carList.add(new Sonata());

    Bus bus = new Bus();
    AutoCar autoCar = new AutoCar();

    bus.run();
    autoCar.run();
    bus.refuel();
    autoCar.refuel();
    bus.takePassenger();
    autoCar.load();
    bus.stop();
    autoCar.stop();
  }
}

// class Sonata extends Car {}

class Bus extends Car {

  @Override
  public void run() {
    System.out.println("버스가 달립니다.");
  }

  @Override
  public void refuel() {
    System.out.println("천연가스를 충전합니다");
  }

  public void takePassenger() {
    System.out.println("승객을 버스에 태웁니다");
  }
}

class AutoCar extends Car {

  @Override
  public void refuel() {
    System.out.println("휘발유를 주유합니다");
  }

  public void load() {
    System.out.println("짐을 싣습니다");
  }
}
