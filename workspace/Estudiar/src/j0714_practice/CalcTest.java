package j0714_practice;

public class CalcTest {

  public static void main(String[] args) {
    int num1 = 12;
    int num2 = 4;
    int num = 9;

    CompleteCalc calc = new CompleteCalc();
    calc.showInfo();
    System.out.println(calc.add(num1, num2));
    System.out.println(calc.subs(num1, num2));
    System.out.println(calc.times(num1, num2));
    System.out.println(calc.divide(num1, num2));
    System.out.println(calc.square(num));

    Calc calc2 = new CompleteCalc();
    // calc2.showInfo();
    System.out.println(calc2.add(num1, num2));
    System.out.println(calc2.subs(num1, num2));
    System.out.println(calc2.times(num1, num2));
    System.out.println(calc2.divide(num1, num2));
    System.out.println(calc2.square(num));
  }
}
