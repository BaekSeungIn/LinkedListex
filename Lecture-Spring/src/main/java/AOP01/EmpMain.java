package AOP01;

public class EmpMain {
	public static void main(String[] args) {
	
		Action action = new Action();
		
		Programmer programmer = new Programmer(action);
		Designer designer = new Designer(action);
		
		programmer.work();
		System.out.println();
		designer.work();
	}
}
