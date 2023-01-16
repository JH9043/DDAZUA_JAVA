package day02;

public class PrintTest {
	
	public static void main(String[] args) {
		
//		 서식 없는 출력
//		print() : 출력 후 줄을 바꾸지 않는다
//		println(): 출력 후 줄을 바꾼다
		System.out.print("안녕 \n자바");
		System.out.println(); // 아무것도 출력하지 않고 줄을 바꾼다. 한 줄 바꾸기
		System.out.println("안녕 자바");
		
//		"+" 연산자는 "+" 연산자의 양쪽에 모두 숫자가 나올 경우 덧셈을 하고
//		한 쪽이라도 문자열이 나오면 문자열을 연결하는 연결 연산자로 사용
		System.out.println("5 + 3 = " + (5 + 3));
		System.out.println("5 - 3 = " + (5 - 3));
		System.out.println("5 * 3 = " + 5 * 3);
		System.out.println("5 / 3 = " + 5 / 3); // 정수와 정수의 연산은 결과도 정수다 (묵시적 형변환)
		System.out.println("5 % 3 = " + 5 % 3); // 나머지
		
//		묵시적 형변환 : 자료형의 크기가 서로 다른 자료의 연산 결과는 크기가 큰 자료형으로 자동 변환된다
//		자바의 기본 자료형
//		boolean : 1byte(8bit), true 또는 false를 기억한다
//		char : 2바이트, 1문자를 기억한다
//		short : 2바이트, -32768 ~ 32767 사이의 정수를 기억
//		int : 4바이트, -2147483648 ~ 2147483637 사이의 정수를 기억
//		long : 8바이트, -2의 63제곱 ~ 2의 63제곱 -1 사이의 정수를 기억
//		float : 4바이트, 단정도 실수, 소수점 아래로 6자리 정도를 표현한다
//		double : 8바이트, 배정도 실수, 소수점 아래로 16자리 정도를 표현한다. float보다 더 정밀한 연산이 가능
		
		System.out.println("5 / 3 = " + 5 / 3.);
		System.out.println("5. / 3 = " + 5. / 3);
		System.out.println("A + 32 = " + ('A' + 32)); //아스키코드 A는 65 a는 97
		System.out.println("A + 32 = " + ('a' - 32));
		
//		명시적 형변환 : 프로그래머가 그 순간의 자료형을 변경할 수 있다. casting, 형변환
		System.out.println("5 / (double)3 = " + 5 / (double)3);
		System.out.println("A + 32 = " + (char)('A' + 32));
		System.out.println("A + 32 = " + (char)('a' - 32));
		
//		서식 있는 출력(printf() ==> c언어의 printf 사용법과 동일
//		printf("출력 서식", 출력할 내용);
//		출력 서식은 출력 서식 문자를 제외한 나머지 문자는 입력한 그대로 출력됨
//		출력 서식 문자 : d(정수), f(실수), c(문자), s(문자열)
//		출력 서식의 형식 : %[-][0][n][.m]서식문자 (대괄호 안에 있는 것들은 필요시 쓰면 됨)
//		- : 출력할 전체 자리 수가 지정된 경우 왼쪽에 맞춰 출력
//		0 : 출력할 전체 자리 수가 지정된 경우 왼쪽의 남는 자리에 0을 채워 출력한다
//		n : 출력할 전체 자리 수
//		.m : 소수점 아래 자리수, 잘리는 자리에서 반올림시켜 출력, 원래 데이터 값은 변경되지 않는다
		
		System.out.printf("5 + 3 = %d\n", 5 + 3);
		System.out.printf("%d + %d = %d\n", 5, 3, 5 + 3);
		System.out.printf("5 / 3 = %f", 5 / 3.);
		
	}
}
