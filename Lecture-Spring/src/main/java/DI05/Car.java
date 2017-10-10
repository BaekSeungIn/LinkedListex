package DI05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	@Autowired
	@Qualifier("koreatire")
	private Tire tire;
	
	public Car() {
		System.out.println("Car() 생성자 호출...");
		//tire = new KoreaTire(); //객체가 바뀔때 마다 새로 new하는것이 번거롭다. 결합도 높음..
	}
	
	/* @Autowired가 사용되면 전역변수에서 한번에 실행이 되기 때문에? 주석영역만큼은 필요가 없다.
	 * 
	 * // 생성자 DI
	
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(tire) 생성자 호출...");
	}
	// 속성 주입
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire(tire) 속성 호출");
	}
	*/ 
	
	
	
	// 속성 DI
		public String getTireBrand() {
			return tire.getTire();
		}
	
}
