package chap06;

public class caculatorsample {
	public static void main(String[] args) {
		// 기본 생성자(매개변수가 없는)를 호출하여 객체를 생성
		// caculator : 객체 참조 변수
		Caculator caculator = new Caculator();
		caculator.calc();
		Caculator = new Caculator(23, "*", 40);
		caculator.calc();
		
	}
}
