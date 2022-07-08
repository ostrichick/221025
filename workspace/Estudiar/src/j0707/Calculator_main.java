package j0707;

public class Calculator_main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int result = calculator.plus(12, 4);
		System.out.println(result);
		System.out.println(calculator.minus(12, 4));
	}
}
