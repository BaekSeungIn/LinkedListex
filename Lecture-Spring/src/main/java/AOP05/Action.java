package AOP05;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Action {

		@Before("execution(public void AOP05.*.work())")
		public void gotoOffice(JoinPoint joinpoint) {
			
			System.out.println("가진것은 없어라~");
			//System.out.println(joinpoint);
		}
		@After("execution(public void AOP05.*.work())")
		public void getOffOffice(JoinPoint joinpoint) {
			System.out.println("마이크하나와~ 동전한 잎 뿐~~");
		}

		@Around("execution(public void AOP05.*.work())")
		public Object process(ProceedingJoinPoint joinpoint) throws Throwable { // <aop:around> 를 사용할 때 필요! 핵심코드가 어디에 들어가야 하는지 알려줌
			

			System.out.println("가진것은 없어라~");
			Object result = joinpoint.proceed(); // 핵심코드가 여기 들어가라고 !. 콕!
			System.out.println("마이크하나와~ 동전한 잎 뿐~~");
			
			return result;
		}
	}
