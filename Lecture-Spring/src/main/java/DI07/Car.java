package DI07;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	/*@Autowired
	@Qualifier("AT")*/
	@Resource(name="KT")
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
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire(tire) 속성 호출");
	}
	 
	
	
	
	// 속성 DI
		public String getTireBrand() {
			return tire.getTire();
		}
	
}
