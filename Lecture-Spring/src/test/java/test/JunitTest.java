package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import AOP05.Employee;
import DI07.Car;
import static org.junit.Assert.assertNull;

import org.junit.Ignore;

import junit.framework.Assert;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:di07.xml","classpath:AOP05.xml"})
public class JunitTest {
	
	@Autowired
	private Car car;
	
	@Autowired
	@Qualifier("programmer")
	private Employee programmer;
	
	@Autowired
	@Qualifier("designer")
	private Employee designer;
	
	@Test
	public void aop테스트() {
		programmer.work();
	}
	
	@Ignore
	@Test
	public void bean테스트() {
		
		System.out.println(car.getTireBrand());
		
		Assert.assertNotNull(car); //car가 null인지 아닌지를 체크한다.
		Assert.assertNull(car);
	}
	
}
