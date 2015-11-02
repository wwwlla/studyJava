package test;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.person.Person;
import util.SpringBeanFactory;
import util.SpringFactory;

public class Test {
	public static void main(String[] args){
//		ApplicationContext ax = new ClassPathXmlApplicationContext("beans.xml");
//		Person person = (Person)SpringFactory.getBeans("person");
//		if(person != null){
//			person.shop();
//		}
		testRunable();
	}
	
	public static void testRunable(){
		TestRun testRun1 = new TestRun(1000l);
		TestRun testRun2 = new TestRun(100l);
		TestRun testRun3 = new TestRun(10l);
		testRun1.start();
		testRun2.start();
		testRun3.start();
	}

}

class TestRun extends Thread {
	public synchronized void get() throws InterruptedException{
		System.out.println(Thread.currentThread().getId());
		Thread.sleep(waitTime);
		set();
	}
	public synchronized void set(){
		System.out.println(Thread.currentThread().getId());
	}
	private final long waitTime;
	public TestRun(long waitTime){
		this.waitTime = waitTime;
	}
	public void run() {
		try {
			get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
