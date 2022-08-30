package chap03;

public class q5 {

	public static void main(String[] args) {
		// * 출력하기
		
		for(int i=1; i<=4;i++) { // 4개 줄 생성
			for (int j=1; j<=i;j++) { // 행 순서만큼 반복
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}

	}

}
