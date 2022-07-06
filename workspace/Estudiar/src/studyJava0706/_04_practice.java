package studyJava0706;

public class _04_practice {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '-';

		if (operator == '+') {
			System.out.println(num1 + num2);
		} else if (operator == '-') {
			System.out.println(num1 - num2);
		} else if (operator == '*') {
			System.out.println(num1 * num2);
		} else if (operator == '/') {
			System.out.println(num1 / num2);
		}
//		switch (operator) {
//		case '+':
//			System.out.println(num1 + num2);
//			break;
//		case '*':
//			System.out.println(num1 * num2);
//			break;
//		case '-':
//			System.out.println(num1 - num2);
//			break;
//		case '/':
//			System.out.println(num1 / num2);
//			break;
//
//		default:
//			break;
//		}

//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				if (i % 2 != 0)
//					continue;
//				System.out.println(i + "x" + j + "=" + i * j);
//			}
//		}

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i < j) {
					break;
				}
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}

		// 4번
		for (int i = 0; i < 4; i++) { // 바깥 4번 반복

			for (int x = 5; x >= 0; x--) { // 공백
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 + 1; j++) { // 별 갯수
				System.out.print("*");
			}
			System.out.println();
		}
		int lineCount = 4; // 줄 갯수 초기값
		int spaceCount = lineCount / 2 + 1; // 공백 갯수 = 줄갯수 / 2 +1
		int starCount = 1; // 별 갯수 초기값

		for (int i = 0; i < lineCount; i++) {
			for (int j = 0; j < spaceCount; j++) {
				System.out.print(' ');
			}
			for (int j = 0; j < starCount; j++) {
				System.out.print('*');
			}
			for (int j = 0; j < spaceCount; j++) {
				System.out.print(' ');
			}
			spaceCount -= 1;
			starCount += 2;
			System.out.println();
		}
		//
		//
		//
	}
}
