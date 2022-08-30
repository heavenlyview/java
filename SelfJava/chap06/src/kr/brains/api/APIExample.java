package kr.brains.api;

public class APIExample {

	public static void main(String[] args) {
		Overriding over = new Overriding();
		
		
		String s1 = new  String ("비즈니스 분석가");
		String s2 = new String ("비즈니스 분석가");
		if(s1 == s2)
			System.out.println("true");
		else
			System.out.println("false");
		over.testEquals(s1,s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		over.testEquals(s1, s2);
		over.testEquals((Object)s1, (Object)s2);
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		over.testEquals(01, 02);
		
		// shift 연산은 비트단위 연산
		// 128을 비트패턴 1000 0000 오른쪽으로 3 밀기
		// 1번 오른쪽으로 밀 때마다 2로 나누는 효과
		System.out.println(Integer.toBinaryString(128));
		System.out.println(128 >> 3);
		System.out.println(128 << 3);
		
		
		Integer intRef = new Integer(100);
		try {
			Integer intRef2 = Integer.valueOf("100L");
		} catch(NumberFormatException nfe) {
			System.out.println("예외발생 처리: " + nfe.getMessage());  
		}
		Integer intRef2 = Integer.valueOf(100);
		Integer intRef3 = (Integer) 100;  //autoboxing
		System.out.println("예외처리 후" + intRef3);
		
	}

}
