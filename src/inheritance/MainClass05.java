package inheritance;

class A05 {
	public A05(int num) {
		System.out.println(num + " : 생성자");
	}
}

class B05 extends A05 {
	// 객체에 매개변수를 넣어서 사용할 때는 오류가 발생할 수 있음
	// 자식을 먼저 찾아가는데 거기서 매개변수를 전달해줄수 없기 때문에 오류 발생
	public B05(int n) {
		super(n);
		System.out.println("자식 생성자");

		// 자기 자신의 값을 지칭하던 this 처럼
		// 부모의 값을 지칭하는건 super을 사용함
	}
}

public class MainClass05 {
	public static void main(String[] args) {

		// A05 a = new A05(100);
		B05 b = new B05(100);

	}
}
