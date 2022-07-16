package j0713_practice;

public abstract class Car {
  public void run(){System.out.println("차가 달립니다");}
  abstract public void refuel();
  public void stop(){System.out.println("차가 멈춥니다");}
}
