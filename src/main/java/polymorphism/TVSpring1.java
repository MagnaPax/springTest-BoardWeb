package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVSpring1 {

	public static void main(String[] args) {

		/*
		 case #4 spring xml config 파일 사용
		 스프링 configuration 파일을 활용한 객체 생성
		 스프링 작동시작
		 applicationContext.xml 으로부터
		 추상적인 애플리케이션 생성
		 */
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

		TV tv = (TV) factory.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.volUp();
		tv.volDown();
		// 컨테이너 종료
		factory.close();

	}

}
