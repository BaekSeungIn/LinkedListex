package DI02;

public class Car {

	private Tire tire;
	private String msg;
	
	public Car() {
		//tire = new KoreaTire(); //객체가 바뀔때 마다 새로 new하는것이 번거롭다. 결합도 높음..
	}
	
	// 생성자 DI
	public Car(Tire tire, String msg) {
		this.tire = tire;
		this.msg = msg;
		System.out.println("Car(tire) 생성자 호출...");
	}
	// 속성 DI
	public String getTireBrand() {
		return tire.getTire();
	}
	
	// 속성 주입
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire(tire) 속성 호출");
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Tire getTire() {
		return tire;
	}
	
}
