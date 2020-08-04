package polymorphism;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("소니 스피커 생성");
	}
	@Override
	public void vUp() {
		System.out.println("소니 볼륨 Up");
	}
	@Override
	public void vDown() {
		System.out.println("소니 볼륨 Down");
	}
}
