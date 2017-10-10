package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain02 {

	public static void main(String[] args) {
		//BeanFactory는 getBean을 로딩하는 순간 객체 생성, ApplicationContext는 xml을 로딩하는 순간 객체를 만든다.
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:beanContainer.xml"); // fileSystem 과 ClassPath를 모두 사용한다. classpath를 기준으로 사용한다.
				//new GenericXmlApplicationContext("file:src/main/resource/beanContainer.xml");// fileSystem 과 ClassPath를 모두 사용한다. filesystem를 기준으로 사용한다.
				//new FileSystemXmlApplicationContext("src/main/resource/beanContainer.xml");
				//new ClassPathXmlApplicationContext("beanContainer.xml"); //ClasspathXml은 src/main/resources를 말한다.

		Hello obj = (Hello)context.getBean("hello"); // Objcet형으로 넘어오는 값을 명시적 형변환을 통해 Hello타입으로 변환시킨다.
		Hello obj2 = context.getBean("hello2",Hello.class); // hello2의 객체가 Object로 넘어오는 것을 Hello.class타입이라고 정의하면서 생성한다.
		
	}
}
