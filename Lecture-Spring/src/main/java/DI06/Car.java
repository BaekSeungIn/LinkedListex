package DI06;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	@Resource(name="americatire")
	
	private Tire tire;
	
	public Car() {
		System.out.println("Car() 생성자 호출...");
	}
	
	 // 생성자 DI
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(tire) 생성자 호출...");
	}
	// 속성 주입
	@Autowired
	@Qualifier("")
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire(tire) 속성 호출");
	}
	 
	
	
	
	// 속성 DI
		public String getTireBrand() {
			return tire.getTire();
		}
	
}
