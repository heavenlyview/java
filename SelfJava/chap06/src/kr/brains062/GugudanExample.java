package kr.brains062;
import kr.brains.ModCalculator;
public class GugudanExample {
	public static void main(String[] args) {
		// 클래스의 생성자를 호출하여 객체를 생성하고, gugudan 참조변수에 할당
		// 참조 변수도 참조하는 클래스와 같은 유형(또는 상위클래스 형)
		Gugudan gugudan = new Gugudan();
		//gugudan.printOne(3);
		gugudan.printAll();
		//gugudan.printFrom(7);
		
		SubGugudan subRef = new SubGugudan();
		subRef.printOne(7);
		subRef.printFrom(5);
		subRef.printFrom(5, "down");
	}
}
