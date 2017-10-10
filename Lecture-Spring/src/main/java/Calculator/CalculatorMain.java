package Calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CalculatorMain {

	public static void main(String[] args) {

		/*Calculator calculator = new DigitalCalculator();
		MyCalculator myCalculator = new MyCalculator(calculator);
		myCalculator.setFirstNo(100);
		myCalculator.setSecondNo(4);
		myCalculator.pringResult();*/
		
		
		ApplicationContext context = new GenericXmlApplicationContext("cal.xml");
		MyCalculator myCalculator = context.getBean("myCalculator",MyCalculator.class);
		
		myCalculator.pringResult();
	
		
	}

}
