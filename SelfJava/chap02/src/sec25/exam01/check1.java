package sec25.exam01;

public class check1 {

	public static void main(String[] args) {
		// 다음과 같이 출력되도록 1~3에 들어갈 코드를 작성하기
		String name = "감자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3= "4567";
		System.out.println("이름: " + name);
		System.out.print("나이: " + age );
		System.out.print("\n");
		System.out.printf("전화: " + "%1s - %2s - %3s ", tel1, tel2, tel3 );
		
	}

}
