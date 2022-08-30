package kr.brains062;

// 같은 패키지에 존재하는 클래스나 java.lang 패키지에 포함된 클래스는 import 없이 사용 가능
import java.util.ArrayList;
import  java.lang.String;
// JCF: Java Collection Framework
// 이해: 상속, 추상클래스, 인터페이스, 제너릭(Generics)

public class ArrayListExtend<T> extends ArrayList<T>{
	public void printHello() {
		System.out.println("클래스, 객체, 싱석 아렵다");	
	}
	public boolean add() {
		super.add("유용구");
		return true;
		
	}
}
