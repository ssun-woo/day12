package inheritance;

class A04 {
	public A04() {
		System.out.println("부모 클래스");
	}

}

class B04 extends A04 {
	public B04() {
		System.out.println("자식 클래스");
	}

}

public class MainClass04 {
	public static void main(String[] args) {

		B04 b = new B04();
		// 순서를 보면 부모 객체가 먼저 만들어지고 그 이후에 자식 객체가 만들어짐
		// 우선적으로 자신의 클래스를 찾아가고, extends가 있다면 부모를 찾아감

		// 디버깅을 통해 순서를 확인할 수 있다
	}
}
