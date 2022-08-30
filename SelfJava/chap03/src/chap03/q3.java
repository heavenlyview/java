package chap03;

public class q3 {

	public static void main(String[] args) {
		// while문과 Math.random() 메소드 이용
		// 주사위 2개 던졌을 때 나오는 눈 - (눈1, 눈2)로 출력
		// 눈의 합이 5가 아니면 계속 던지고
		// 눈의 합이 5이면 실행을 멈추는 코드 작성
		//눈의 합이 5가 되는 조합: (1, 4), (4, 1), (2, 3), (3, 2)
		
		while(true) {
			int num = (int) (Math.random() *6) +1;
			int num2 = (int) (Math.random() *6) +1;
			System.out.println("("+ num + "," + num2 + ")");
			
			if(num+num2 == 5) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
