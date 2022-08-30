package kr.brains062;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayListExt<String>  ale = new ArrayListExt<String>();
		ale.add("고객");
		ale.add("경험");
		ale.add("데이터를");
		ale.add("활용한");
		ale.add("데이터");
		ale.add("비즈니스");
		ale.add("분석가 과정");
		ale.printHello();
		// for문: 반복 횟수가 정해진 경우 사용, 순차 접근 가능, 제어변수에 따른 접근
		for(int i=0;i <ale.size(); i++)
			System.out.print(ale.get(i) + " ");
		for(String s : ale) // foreach statement
			System.out.print(String + " ");
		
	}
}
