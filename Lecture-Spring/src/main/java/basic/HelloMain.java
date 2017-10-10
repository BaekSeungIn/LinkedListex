package basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class HelloMain {

	public static void main(String[] args) {

		Resource resource = //new ClassPathResource("classpath:beanContainer.xml"); //classpath를 알고있을 경우,???  생략해도 된다. 
							new FileSystemResource("src/main/resources/beanContainer.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Hello obj = (Hello)factory.getBean("hello"); // resource에 있는 beanContainer.xml에 있는 bean의 id가 hello인 아가를 댈고옴..
		Hello obj2 = (Hello)factory.getBean("hello2"); // getBean을 하는 순간  생성된다. 싱글턴 패턴이기 때문에 없을때만 생성한다.!.
		
		System.out.println(obj);
		System.out.println(obj2);
		
	}
}
