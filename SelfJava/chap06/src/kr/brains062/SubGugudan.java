package kr.brains062;

// Gugudan 클래스가 같은 패키지에 있는 경우 (향후 import 되었거나)
public class SubGugudan extends Gugudan {
	public SubGugudan(int dan) {
		super(dan); // this([매개변수목록]): 현재 클래스의 생성자를 호출
	}                      // vs uper([매개변수목록]): 부모클래스(수퍼클래스)의 생성자를 호출
	// direction : up, down - up dan -> 9단, down 2단 -> dan
	// 메소드중첩 (overloading)
	public void printFrom(int dan, String direction) {
		
	}
}

