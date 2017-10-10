package DI01;

public class Car {

	private Tire tire;
	
	public Car() {
		//tire = new KoreaTire(); //객체가 바뀔때 마다 새로 new하는것이 번거롭다. 결합도 높음..
	}
	
	// 생성자 DI
	public Car(Tire tire) {
		this.tire = tire;
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
	
}
