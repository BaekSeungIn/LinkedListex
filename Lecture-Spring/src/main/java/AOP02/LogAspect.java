package AOP02;

public class LogAspect {

	public void Start() {
		System.out.println("[로그 시작] *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
	}
	
	public void End() {
		System.out.println("[로그 아웃] -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
	}
}
