package AOP03;

import org.aspectj.lang.ProceedingJoinPoint;

public class Action {

	
	public Object process(ProceedingJoinPoint joinpoint) throws Throwable { // <aop:around> 를 사용할 때 필요! 핵심코드가 어디에 들어가야 하는지 알려줌
																			

		System.out.println("가진것은 없어라~");
		// try {
		Object result = joinpoint.proceed(); // 핵심코드가 여기 들어가라고 !. 콕!
		/*
		 * } catch (Throwable e) { e.printStackTrace(); }
		 */
		System.out.println("마이크하나와~ 동전한 잎 뿐~~");
		
		return result;
	}
}
