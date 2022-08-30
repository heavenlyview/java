package sec25.exam01;

import java.util.Scanner;

public class check2 {

	public static void main(String[] args) {
		// 2. Scanner를 이용해서 두 수를 덧셈하여 결과 출력해보기
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();
		
		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine() ;
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
		
	}

}
