package Calculator;

public class DigitalCalculator implements Calculator {

	

	@Override
	public int add(int FirstNo, int SecondNo) {
		return FirstNo+SecondNo;
	}



	@Override
	public int sub(int FirstNo, int SecondNo) {
		return Math.abs(FirstNo-SecondNo);
	}



	@Override
	public int mul(int FirstNo, int SecondNo) {
		return FirstNo*SecondNo;
	}

	@Override
	public int div(int FirstNo, int SecondNo) {
		return FirstNo/SecondNo;
	}
	
	



	
}
