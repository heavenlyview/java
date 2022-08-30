package chap03;

public class q6 {

	public static void main(String[] args) {
		// *찍기 (반대로)
		
		for(int i=1; i<=4;i++) { // 4개 줄 생성
			for (int j=4; j>=i;j--) { // 행 순서만큼 반복
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}

	}

}
