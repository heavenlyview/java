package chap03;

public class q501 {

	public static void main(String[] args) {
		for(int i=1; i<=4;i++) { // 4개 줄 생성
			for (int j=4; j>0;j--) { // 행 순서만큼 반복
				if (i < j) {
					System.out.print(" ");
				}else {
						System.out.print("*");
					}
				}
			System.out.println();
			
			}

		}

	}
