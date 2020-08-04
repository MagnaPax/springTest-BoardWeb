package polymorphism;

public class TVUser {
	public static void main(String[] args) {
		/* case #1
		 * 직접 객체 사용 방식은
		 * 다른 객체를 사용하고자 할때 재 생성해야하는 문제가 있음
		 * 내부 메서드까지 다 바뀜
		 * 삼성 TV를 사용하고 싶을때
		SamsungTV tv= new SamsungTV();
		tv.powerOn();
		tv.powerOff();
		tv.volUp();
		tv.volDown();
		*/
		
		LgTV tv= new LgTV();
		LgTV tv1= new LgTV();
		LgTV tv2= new LgTV();
		LgTV tv3= new LgTV();
		
		tv.turnOn();
		tv.turnOff();
		tv.soundUp();
		tv.soundDown();
		
		
	}

}
