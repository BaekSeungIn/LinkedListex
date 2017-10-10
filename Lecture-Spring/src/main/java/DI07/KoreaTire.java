package DI07;

import org.springframework.stereotype.Component;

//Componet ==> <bean class="DI07.KoreaTire" id="koreatire"/>

@Component("KT")
public class KoreaTire implements Tire {
	
	public String getTire() {
		return "한국타이어";
	}

}
