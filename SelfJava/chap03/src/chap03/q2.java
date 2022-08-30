package chap03;

public class q2 {

	public static void main(String[] args) {
		//for문 사용, 1~100까지 정수 중 3의 배수의 총합 구하는 코드
		int sum = 0;
		
		for(int i=3; i<=100; i++) {
			if  (i % 3 != 0) {
				continue;
			}
			sum +=i;
		}
		System.out.println(sum);
	}
}
			
