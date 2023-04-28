package singleton;

/*
 싱글톤(singleton)
  - 직접 만들어서 사용하는 경우는 드물다
  - 하나의 객체를 만들어서 공유하는 것
 */

class A01 {
	int num;
	static int cnt;

	public A01() {
		cnt++;
		System.out.println(cnt + "객체 생성");
	}
}

public class MainClass01 {

	public static void main(String[] args) {

		A01 a01 = new A01();
		A01 a02 = new A01();
		A01 a03 = new A01();
		
		a01.num = 100;
		a02.num = 200;
		a03.num = 300;
		
		System.out.println("a : " + a01.num + " : " + a01);
		System.out.println("b : " + a02.num + " : " + a02);
		System.out.println("c : " + a03.num + " : " + a03);
		
		/*
		 
		 a객체
		 b객체
		 c객체
		 
		 객체는 new를 만나면 기본 생성자를 생성하고 완료되면 새로운 객체를 생성한다
		 */
	}
}




















