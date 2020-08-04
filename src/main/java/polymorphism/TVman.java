package polymorphism;

public class TVman {

	public static void main(String[] args) {

		/*
		 * case #2 다형성을 이용한 객체 생성 
		 * 매우 쉽게 객체 교체 가능
		 */
		
//		TV tv = new SamsungTV();
		TV tv = new SharpTV();
		tv.powerOn();
		tv.powerOff();
		tv.volUp();
		tv.volDown();
	}

}
