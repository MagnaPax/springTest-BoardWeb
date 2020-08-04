package polymorphism;

public class SamsungTV implements TV {

	public void powerOn() {
		System.out.println("삼성 tv 켜짐");
	}

	public void powerOff() {
		System.out.println("삼성 tv 꺼짐");
	}

	public void volUp() {
		System.out.println("삼성 tv 볼륨 업");
	}

	public void volDown() {
		System.out.println("삼성 tv 볼륨 다운");
	}
}
