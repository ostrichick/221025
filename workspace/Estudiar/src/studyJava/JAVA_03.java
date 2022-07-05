package studyJava;

public class JAVA_03 {
	public static void main(String[] args) {

		// 부호 연산자는 + 또는 -기호를 사용하여 음수 양수 표현
		// 대상은 리터럴 혹은 변수 (boolean 과 char 제외)
		System.out.println(-10);
		int aa = -10;
		System.out.println(-aa);

		// 증감 연산자 ++ -- 사용하여 1씩 증가 1씩 감소
		int a = 1;
		// 증감연산자가 변수의 뒤에 붙어있으면 후위증가 후위감소라고 한다
		// 이때 연산은 실행문 뒤에 이루어진다
		int b = a++;
		System.out.println(b); // a++이 적용 안된상태
		System.out.println(a); // a++이 적용된 상태

		// 증감연산자가 변수 앞에 있으면 전위증가 전위감소라고 한다
		// 이때 연산은 증감연산자 먼저 실행후 실행문에 적용됨
		b = --a;
		System.out.println(b); // 이미 --a 이 적용된 상태

//		System.out.println(10.0 / 3 / 3 * 9 / 9 * 10);
//		System.out.println(10 / 3 / 3 * 9 / 9 * 10);

		// 산술 연산자
		// 종류 + - * / %
		a = 2 * 3 + 4; // 우선순위에 따라 연산의 방향은 왼쪽에서 오른쪽으로 * / %부터 연산
		// ()괄호를 사용해 우선순위보다 먼저 실행 가능
		System.out.println(a);

		a = 10;
		double bb = 2.0;
		// 산술연산에서 피연산자의 데이터타입이 다른경우 더큰 데이터 타입으로 자동 형변환
		var result = a + bb;
		System.out.println(result);
		// 정수 연산에서 값을 0으로 나누거나 나머지를 구하려면 / by zero 오류 나옴
//		int intResult = 10 % 0;

		// 컴파일러는 연산식에서 데이터를 확인하지 않기때문에 0.0으로 0으로 나누려고할때 컴파일오류를 내지않음
		// 오류를 띄우지 않기 때문에 개발단계에서 값을 예측하여 따로 처리해야함
		result = 10.0 / 0.0;
		// 실수에서 0.0으로 나누면 정확한 0이 아니기 때문에 몫이 무한대가 됨
		System.out.println(result);

		// 실수에서 0.0으로 나눈 나머지를 구하면 나머지가 정확하지 않으므로 NaN출력
		result = 10.0 % 0.0;
		System.out.println(result);

		// 문자열 연산자 +
		// 문자열 연산자는 산술 연산의 덧셈과 기호가 동일, 우선순위도 동일
		// 피연산자 둘중 하나라도 문자면 문자가 됨
		// 자바의 참조타입 종류 중 하나
		// 데이터 타입은 String

		// 문자는 ''로 감싸고 문자열은 ""로 감쌈
		// '' 문자로는 빈문자열을 담을 수 없다 (유니코드 없음)
		// 문자열은 데이터 끝에 널 값을 담고있어 문자열을 데이터상에 표현
		String str = "";

	}
}
