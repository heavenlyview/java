package kr.brains.interf;

public class SmartPhoneExample {
	// 인터페이스들을 정의하고, 다중 구현(multiple implementation)을 통해 정의
	// 정의한 클래스로부터 객체를 생성하고
	// 생성된 객체와 상호작용을 통해 문제를 해결
	
	// Java는 다중 상속은 지원하지 않음, 즉 extends 뒤에 하나만 나타남
	// 인터페이스는 다중 구현이 가능함, 즉 implements 뒤에 여러 개가 나타날 수 있음
	
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		//sp.call("010-1234-8765");
		sp.call(SmartPhone.phoneNumber);
		sp.playMusic("번개맨송");
		sp.sendMsg("010-1234-8765","아!힘들다");
		Timer t = sp; // sp가 참조하는 객체를 Timer 인터페이스 구현
		((SmartPhone) t).call(SmartPhone.phoneNumber);
		sp.call(SmartPhone.phoneNumber);
	}
}
