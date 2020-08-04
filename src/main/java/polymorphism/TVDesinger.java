package polymorphism;

public class TVDesinger {

	public static void main(String[] args) {
		/*case #3
		 * 객체생성용 factory 를 활용하여
		 * 호출되는 대로 객체 적용
		 * arg[0] 은 반드시 호출 매개변수
		 * run as configuration > arguments
		 * */
		BeanFactory factory= new BeanFactory();
		TV tv=(TV)factory.getBean(args[0]);//"samsung"

		tv.powerOn();
		tv.powerOff();
		tv.volUp();
		tv.volDown();
	}

}
