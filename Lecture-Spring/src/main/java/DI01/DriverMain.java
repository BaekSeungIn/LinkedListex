package DI01;

public class DriverMain {

	public static void main(String[] args) {

		Tire tire = new KoreaTire(); // 여기만 바꾸어주면... 모두가 다 ~~~ 바뀐답니다~^^

		tire = new AmericaTire();
		
		// 생성자 주입방식
		Car car = new Car(tire);

		// 속성(Setter) 주입방식
		Car car2 = new Car();
		car2.setTire(tire);

		System.out.println(car.getTireBrand());
	}

}
