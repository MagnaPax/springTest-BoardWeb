package polymorphism;

public class TVDesigner {

	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		TV tv = (TV) factory.getBean(args[0]);
		tv.powerOn();
		tv.powerOff();
		tv.volUp();
		tv.volDown();

	}

}
