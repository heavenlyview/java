package kr.brains063;

import java.util.ArrayList;

public class CarExample extends ArrayList {
	String programName = "CarExample";

	public static void main(String[] args) {
		CarExample ce = new CarExample();
		System.out.println(ce.programName);
		
		Car.model = "전기차";
		System.out.println("현재 모델:" + Car.model);
		System.out.println("가장큰 int값: " + Integer.MAX_VALUE);
		int i = 1_000_000_000;
		int j = 1000000000;
		
		
		Car car = new Car(); // 객체 생성
		//car.model = "가스차"; // 인스턴스 변수 값 배정
		
		car.setGas("60L"); //30L: setter를 이용한 값 배정" "30L" 문자열
		System.out.println("현재 Gas : " + car.getGas());

		car.run();
		/*
		String str = "현대자동차";
		System.out.println(str.charAt(3));
		int i = 66;
		// Integer : int 기본형을 효과적으로 조작하기 위해 정의한 클래스
		// Wrapper Class : 기본자료형을 효과적으로 조작하기 위해 정의한 클래스
		System.out.println(Integer.toHexString(i));
		*/

		

	}

}
