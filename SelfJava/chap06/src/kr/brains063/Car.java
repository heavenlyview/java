package kr.brains063;

public class Car {
	// 2개의 인스턴스 멤버 필드, 4개의 인스턴스 메소드
	// public static final: 상수 변수 정의, 전체 대문자
	
	static String model = "가스차";

	private int gas;
	
	void setGas(String gas) {// 가스를 주입한 결과
		String digit = gas.substring(0, gas.length() -1);
		int igas = Integer.parseInt(digit); //parseInt(): 숫자 문자열을 숫자로 변환해주는 (파싱해주는) 메소드
		if(igas > 60) {
			System.out.println((igas-60) + "양 초과, 60L만 주유합니다.");
			igas = 60;
			}
			this.gas = igas;
	}
	int getGas() {
		return gas;
	}
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		}
		else
			System.out.println("gas가 있습니다");
			return true;
	}
	void run() {
		while(isLeftGas()) {
			if(gas > 0) {
				System.out.println("달립니다.gas 잔량"+gas+")");
				gas -=1;
			}
			else
				System.out.println("멈춥니다. gas 잔량"+gas+")");
				break;
				
		}
	}
}
