package polymorphism;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker(){
		System.out.println("Apple 스피커 생성");
	}
	@Override
	public void vUp() {
		System.out.println("Apple 스피커 v UP");
		
	}
	@Override
	public void vDown() {
		System.out.println("Apple 스피커 v Down");
		
	}
}
