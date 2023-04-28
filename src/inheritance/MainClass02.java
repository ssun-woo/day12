package inheritance;

import java.util.ArrayList;

class A02 extends ArrayList<String>{
	// arraylist를 상속받아서 그 기능을 사용할 수도 있다
}


public class MainClass02 {
	public static void main(String[] args) {
		
		A02 a = new A02();
		a.add("1111");
		
		System.out.println(a.get(0));
		
	}
}
