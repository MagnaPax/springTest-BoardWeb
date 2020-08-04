package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVSpring1 {

	public static void main(String[] args) {
		/* case #4 spring xml 컨피그 파일  사용
		스프링 configuration 파일을 활용한 객체 생성
		 스프링 작동시작
		 applicationContext.xml 으로 부터
		 추상적인 어플리케이션 생성
		 */
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		//
		TV tv = (TV) factory.getBean("tv");
		TV tv1 = (TV) factory.getBean("tv");//"samsung"
		TV tv2 = (TV) factory.getBean("tv");//"samsung"
		tv.powerOn();
		tv.powerOff();
		tv.volUp();
		tv.volDown();
		tv1.powerOn();
		tv2.powerOn();
		// 컨테이너 종료
		factory.close();

	}

}
