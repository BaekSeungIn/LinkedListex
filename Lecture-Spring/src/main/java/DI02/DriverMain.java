package DI02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
		
		
	ApplicationContext context = new GenericXmlApplicationContext("di02.xml");
		
	//속성주입
		/*Tire tire = context.getBean("tire", Tire.class);
		
		Car car = context.getBean("car", Car.class);
		car.setTire(tire);*/
		
	Car car = context.getBean("car",Car.class);
		System.out.println(car.getTireBrand());
		System.out.println(car.getMsg());
	}

}
