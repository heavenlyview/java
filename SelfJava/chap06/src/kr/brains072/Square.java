package kr.brains072;

public class Square extends Polygon {
	public Square(int length) {
		super(length,  length);

	}
	
@Override
// annotation: 어노테이션 - 컴파일러에게 컴파일을 잘 할 수 있도록 정보 제공
	public int evaluate() { //재정의: 메소드 이름, 매개변수 갯수, 타입 동일
		return (getHeight()* getWidth());

	}

}
