package inheritance;

/*
 상속(inheritance)
  - 부모, 자식 관계를 가지고 있다
  - 부모가 가지고 있는 코드를 그대로 물려받아 사용하는 것
  - extends를 사용하여 상속 받는다
  
 */

class Calc {
	public void calc() {
		System.out.println("나는 계산기야");
	}
}

class Computer extends Calc{
	public void computer() {
		System.out.println("나는 컴퓨터야");
	}
}
// extends로 상속받을 수 있음
// 내가 갖고있는 기능(메소드)이 없으면 부모를 찾아가 기능(메소드)을 찾는다
// Calc = 부모, Computer = 자식

public class MainClass01 {
	
	public static void main(String[] args) {
		
//		Calc c = new Calc();
//		c.calc();
		
		Computer com = new Computer();
		com.computer();
		com.calc();
		
	}
	
	
	
}
