package Calculator;

public class MyCalculator {

	private int FirstNo;
	private int SecondNo;
	private Calculator calculator;

	public MyCalculator(int firstNo, int secondNo, Calculator calculator) {
		super();
		FirstNo = firstNo;
		SecondNo = secondNo;
		this.calculator = calculator;
	}

	public MyCalculator() {
	}

	public MyCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public int getFirstNo() {
		return FirstNo;
	}

	public void setFirstNo(int firstNo) {
		FirstNo = firstNo;
	}

	public int getSecondNo() {
		return SecondNo;
	}

	public void setSecondNo(int secondNo) {
		SecondNo = secondNo;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public void add() {
		System.out.println("합 : " + calculator.add(FirstNo, SecondNo));
	}

	public void sub() {
		System.out.println("차 : " + calculator.sub(FirstNo, SecondNo));
	}

	public void mul() {
		System.out.println("곱 : " + calculator.mul(FirstNo, SecondNo));
	}

	public void div() {
		System.out.println("몫 : " + calculator.div(FirstNo, SecondNo));
	}

	public void pringResult() {
		System.out.println("첫번째 입력받은 값 : " + FirstNo + "두번째 입력받은 값 : " + SecondNo);
		add();
		sub();
		mul();
		div();
	}

}
