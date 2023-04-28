package exception;

class A04 {
}

class B04 extends A04 {
}

class C04 extends A04 {
}

public class MainClass04 {
	public static void main(String[] args) {

		C04 c = new C04();
		A04 a;
		a = new C04();
		a = new B04();
		// 상속을 받으면 이렇게 사용가능
		// 부모형태로 자식을 상속받을 수 있음

		int num = 0;
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		try {
			//System.out.println(10 / 0);

			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}

		} catch (Exception e) {
			// System.out.println("0으로 나눌 수 없음!");
			// 이렇게 만들면 어느 부분이 문제가 되는지 모름
			e.printStackTrace();
			// 보통 이렇게 많이 사용한다
		}

		System.out.println("다음 문장들 실행");
	}

}
