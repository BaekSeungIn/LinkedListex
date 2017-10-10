package AOP01;

public class Designer implements Employee {

	private Action action;

	public Designer(Action action) {
		this.action = action;
	}

	
	@Override
	public void work() {
		//System.out.println("출근"); // 출근,퇴근은 공통의 코드이다.  ==> 횡단 관심사.
		action.gotoOffice();
		System.out.println("디자인 한다.");
		action.getOffOffice();
		
	}

}
