package chap06;

// 상속 (inheritance) : 상속 허가된 것만 상속해서 사용 가능
public class ModeCaculator extends caculator {
		// 생성자는 아무 생성자도 정의하지 않은 경우 컴파일러가 기본 생성자를 정의해줌
		// 생성자가 하나 이상 존재하는 경우 컴파일러는 기본 생성자를 정의하지 않음
		// this ㅣ 클래스로부터 생성된 객체 자신을 가리키는 예약어
		// 인스턴스 변수나 메소드를 접근할 때 사용
		// 변수 : 기억  공간에 대한 식별자
	 	// 스코프 ( Scope)
	
	public ModCaculator(int o1, String op, int o2) {
			operand1 = o1;
			operator = op;
			operand2 = o2;
		}
}
