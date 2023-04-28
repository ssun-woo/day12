package inheritance;

import java.util.ArrayList;

class A03 {
	private ArrayList<String> arr;

	public A03() {
		arr = new ArrayList<>();
	}

	public ArrayList<String> getArr() {
		return arr;
	}
}

public class MainClass03 {
	public static void main(String[] args) {

		A03 a = new A03();
//		a.arr.add("1111");
		ArrayList<String> arr = a.getArr();
		arr.add("111");

//		System.out.println(a.arr.get(0));
		System.out.println(arr.get(0));

		// 상속은 그 객체를 만들어서 바로 사용할 수있지만
		// 내부에 만들어두면 그 안에 arr에 접근해서 사용해야 한다
		// private로 지정했다면 get메소드도 따로 만들어야 한다

	}
}
