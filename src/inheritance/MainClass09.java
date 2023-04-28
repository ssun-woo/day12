package inheritance;
//public : 누구든 사용가능
// private : 클래스 외부에서 사용 불가능
// protected : 외부의 접근은 불가능하고 자식에게는 허용된다
// private < default(없는거) < protected < public
class A09 {
	protected int num = 100;
	String s = "부모";
}

class B09 extends A09 {
	String s = "자식";

	public void test() {
		System.out.println(num);
		System.out.println(super.s);
		System.out.println(this.s);
	}
}

public class MainClass09 {
	public static void main(String[] args) {

		B09 b = new B09();
		b.test();

	}
}
