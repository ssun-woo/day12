package inheritance;

class A08 {
	public void a() {
		System.out.println("aaa");
	}
}

class B08 extends A08 {
	public void b() {
		System.out.println("bbb");
	}
}

class C08 /*extends A08, B08*/ extends B08{
		// 이런 문법은 허용하지 않음
		// 그래서 위로 올라가며 각각을 상속받는다
	public void c() {
		System.out.println("ccc");
	}
}

public class MainClass08 {
	public static void main(String[] args) {
		
		C08 c = new C08();
		c.a();
		
	}
}
