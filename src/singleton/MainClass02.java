package singleton;

class A02{
	int num;
	public A02() {
		System.out.println("생성자 실행");
	}
	
}

public class MainClass02 {
	
	public static void main(String[] args) {
		
		A02 a01 = new A02(); // 생성자를 호출해야 객체가 만들어진다
		A02 a02 = a01;
		A02 a03 = a02;
		// 'new' 연산자를 한번만 만나기 때문에 생성자가 실행된다
		
		a01.num = 100;
		a02.num = 200;
		a03.num = 300;
		
		System.out.println("a : " + a01.num + " : " + a01);
		System.out.println("b : " + a02.num + " : " + a02);
		System.out.println("c : " + a03.num + " : " + a03);
		
		// new연산자를 세번 사용했을 때와는 다르게
		// 모든 값이 같고, 주소도 같다
		
		// 최초 new를 만날때 객체를 만듦
		// 그리고 그 주소를 a01에 저장함
		// a02에 a01을 저장하기 때문에 주소를 그대로 복사해 옴
		// a03도 마찬가지로 그 주소를 복사해옴
		// a01, a02, a03이 모두 같은 공간을 보고있기 때문에 그 공간의 num값을 수정하면 모든 값이 바뀐다
		
		
		
		
		
		
		
		
	}
}
