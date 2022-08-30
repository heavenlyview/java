package kr.brains072;

public class Trapezoid extends Polygon{
	private int upper;
	super(height, width);
	this.upper = upper;
	
	public Trapezoid(int height, int width, int upper) {
		super (height, width);
		this.upper = upper;
	}
	@Override
	public int evaluate() { // 메소드 선언부: 사용법 또는 활용법
		int area = (getWidth()+getUpper()) * getHeight()/2;
		return area;
	}
}
