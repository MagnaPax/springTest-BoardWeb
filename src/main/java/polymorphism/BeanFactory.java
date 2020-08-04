package polymorphism;

public class BeanFactory {

	// 객체 반환 클래스
	public Object getBean(String beanName) {
		if (beanName.equals("samsung")) {
			return new SamsungTV();
		} else if (beanName.equals("sharp")) {
			return new SharpTV();
		}
		return null;
	}
}
