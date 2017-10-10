package AOP05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {
	public static void main(String[] args) {

		//Action action = new Action();
		
		ApplicationContext context = new GenericXmlApplicationContext("aop05.xml");

		Employee programmer = (Employee)context.getBean("programmer");
		programmer.work();

		Employee designer = context.getBean("designer",Employee.class); // 받는값이 interface형태여야 한다.!

		System.out.println();
		designer.work();

		
		/*
		 * Programmer programmer = new Programmer(); Designer designer = new Designer();
		 */

	}
}
