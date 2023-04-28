package singleton;

class A03{
	private static A03 a;
	// 밑에 메소드가 static을 사용중이기 때문에 그 안에서 사용하려는 a변수에도 static이 붙어야 한다
	int num;
	
	private A03() {
		System.out.println("생성자 실행");
	}
	
	public static A03 getInstance() {
		
		// System.out.println(a);	// a는 최초에 null이라는 값을 갖는다
		if(a == null) {
			a = new A03();
		}
		return a;
		// a가 null값을 가지면(최초 1회) 새로운 객체를 만든다
		// 이후에 다시 만나면 null이 아니기 때문에 그냥 그 값을 return한다
		
	}
	// 그래서 객체를 클래스 내부에서만 생성하게 해둠
	// .연산자는 사용할 수 없음(객체 생성이 불가능)
	// static을 사용해야함
}

public class MainClass03 {

	public static void main(String[] args) {
		// A03 a01 = new A03();
		// 생성자를 private로 만들어서 새로운 객체를 만들지 못하게 함
		
		
		A03 a01 = A03.getInstance();
		// static을 사용했기 때문에 클래스 이름으로 메소드에 접근 가능
		
		A03 a02 = A03.getInstance();
		A03 a03 = A03.getInstance();
		System.out.println("=================");
		
		a01.num = 100;
		a02.num = 200;
		a03.num = 300;
		
		System.out.println("a : " + a01.num + " : " + a01);
		System.out.println("b : " + a02.num + " : " + a02);
		System.out.println("c : " + a03.num + " : " + a03);
		
		// 마지막으로 확인하면 모두 같은 주소를 갖고있는다
		// MainClass02와 같이 모두 같은 값, 주소를 갖는다
		
		
	}
}
