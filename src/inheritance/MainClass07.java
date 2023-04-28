package inheritance;

import java.util.ArrayList;

class A07 extends ArrayList<String> {
	public void test(){
		super.add("111");
		System.out.println("부모 test실행");
	}
	
}

class B07 extends A07{
	
	public void bbb() {
		System.out.println("자식 bbb 실행");
		// test();
		// 같은 Class 안에서 호출하는 거라 일단 자기 클래스에서 찾음
		// 만약 없으면 부모를 찾아가서 test를 찾음
		
		super.test();
		this.test();
		// 코드의 가독성을 위해 super와 this로 구분지어 사용한다
	}
	
	public void test() {
		System.out.println("자식 test실행");
	}
	// method overriding
	// 일단 부모자식을 찾아오기 때문에 있으면 바로 실행됨
	
}

public class MainClass07 {
	
	public static void main(String[] args) {
		
		B07 b = new B07();
		b.bbb();
		// b.test();
		
		
		
		
		
		
		
	}
}































