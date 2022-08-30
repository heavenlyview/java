package chap03;

public class ch41q4 {

	public static void main(String[] args) {
		System.out.println("어떤 혜택을 원하세요?");
		char grade = 'c';
		switch(grade) {
		case 'a': System.out.println("vvip 혜택을 받을 수 있습니다.");
		case 'b': System.out.println("vip 혜택을 받을 수 있습니다."); break;
		case 'c': System.out.println("우수 혜택을 받을 수 있습니다.");
		case 'd': System.out.println("일반 혜택을 받을 수 있습니다."); break;
		default: System.out.println("혜택이 없습니다.");
		}
System.out.println("혜택이 없습니다.");
	}

}
