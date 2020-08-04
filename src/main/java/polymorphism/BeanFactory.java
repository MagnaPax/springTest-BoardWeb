package polymorphism;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class BeanFactory {
	/* 객체 생성 반환 클래스
	 * */
	public Object getBean(String beanName) {
		if(beanName.equals("samsung")) {
			return new SamsungTV();
		}else if(beanName.equals("sharp")) {
			return new SharpTV();
		}
		return null;
	}
}
