package inheritance;

class A06{
	public A06(String s) {
		System.out.println(s + " : 부모 실행");
	}
	
	public A06() {
	}
	// method overloading
	// default 생성자로 전달하기 때문에 오류 X
}

class B06 extends A06{
	public B06() {
		System.out.println("자식 생성자 실행");
	}
	
}


public class MainClass06 {
	
	public static void main(String[] args) {
		
		B06 b = new B06();
		
		
		
		
		
		
	}
}
