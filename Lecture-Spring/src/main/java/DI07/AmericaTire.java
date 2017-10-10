package DI07;

import org.springframework.stereotype.Component;

@Component("AT")
public class AmericaTire implements Tire {
	
	public String getTire() {
		return "미국타이어";
	}

}
