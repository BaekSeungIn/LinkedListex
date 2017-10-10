package AOP02;

import org.aspectj.lang.JoinPoint;

public class Action {

	
	public void gotoOffice(JoinPoint joinpoint) {
		
		System.out.println("퇴근.. 과 동시에 출근하자..");
		//System.out.println(joinpoint);
	}
	
	public void getOffOffice(JoinPoint joinpoint) {
		System.out.println("퇴근..");
	}
	

}
