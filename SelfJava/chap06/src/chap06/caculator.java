package chap06;

public class caculator {
	private int operand1;
	private int operand2;
	private String operator;
	
	// constructor : 객체 초기화
	public Caculator() { // 기본(default) 생성자
		this.operand1 = 10;
		this.operator = "+";
		this.operand2 = 20;
	}
	public int calc() {
		int result = 0;
		if(operator.equals("+"))
			result = operand1 + operand2;
		else if(operator.equals("-"))
			result = operand1 - operand2;
		else if(operator.equals("*"))
			result = operand1 * operand2;
		else if(operator.equals("/"))
			result = operand1 / operand2;
		return result;
	}
}
