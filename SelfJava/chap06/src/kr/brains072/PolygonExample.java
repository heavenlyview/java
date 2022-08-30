package kr.brains072;

public class PolygonExample {
	// 매개변수에 배열을 사용하면 매개변수 개수를 가변적으로 사용 가능
	public static void main(String[] args) {
		
		ArrayList<Triangle> arrPoly = new ArrayList<>();
		
		Polygon poly = new Triangle (50, 80);
		System.out.println ("넓이는: " + poly.evaluate());
		arrPoly.add(poly);
		
		Triangle triangle = new Triangle(50, 80);
		System.out.println("넓이는 :" + triangle.evaluate());
		Square square = new Square(80);
		System.out.println("넓이는 :" + square.evaluate());
	}
}
