package AOP01;

public class Programmer implements Employee {

	private Action action;

	public Programmer(Action action) {
		this.action = action;
	}
	
	@Override
	public void work() {

		action.gotoOffice();
		System.out.println("개발을 한다.");
		action.getOffOffice();
	}

}
