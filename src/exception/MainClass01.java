package exception;

import java.util.Scanner;

/*
 예외 종류
  - 강제 예외 : throw
  - 예외 전가 : throws
  - 예외 처리 : try, catch
  - 예외처리 목적
    - 프로그램을 꺼지지 않게 만든다
  - 예외 처리는 예외적인 상황을 처리하는 것
 */

public class MainClass01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x, y, result = 0;

		System.out.println("수 입력 ");
		x = scan.nextInt();
		y = scan.nextInt();
		try {
			result = x / y;
			System.out.println("결과 : " + result);
		} catch (ArithmeticException e) {
			System.err.println("0으로는 나눌 수 없음!");
		}
		System.out.println("다음 문장들 실행...");

	}
}
