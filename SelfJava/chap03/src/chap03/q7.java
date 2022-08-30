package chap03;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		// while문과 Scanner 이용
		// 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성하기
		// Scanner의 nextLine()사용
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------");
			System.out.print("선택> ");
			
		}
		System.out.println("프로그램 종료");
	}

}
