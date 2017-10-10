package DI04;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MapMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di04-1.xml");
		
		MapAddress map = context.getBean("map",MapAddress.class);
		Map<String, String> address = map.getAddress();
		
		Set<Entry<String,String>> entry = address.entrySet();
		for(Entry<String,String> e : entry) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}

}
