package kr.brains072;

// 다각형의 넓이를 구하기 위한 클래스를 정의하고, (객체 생성), 활용

public abstract class Polygon {
	private int height; // 세로
	private int width; // 가로
	private int depth; //적층 : 기둥의 부피
	private int area; // 넓이
	
	public Polygon(int height, int width) {
		this.height = height;
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	public void setWidth(int w) {
		width = w;
	}
	public void getWidth() {
		return width;
	}
	public abstract int evaluate(); // 추상 메소드: 상속받는 쪽에서 구현
}
