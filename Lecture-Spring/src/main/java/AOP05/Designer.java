package AOP05;

import org.springframework.stereotype.Component;

@Component
public class Designer implements Employee {

	
	@Override
	public void work() {
		System.out.println("디자인 한다.");
		
	}

}
