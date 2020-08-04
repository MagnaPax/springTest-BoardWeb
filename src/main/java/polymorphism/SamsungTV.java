package polymorphism;

public class SamsungTV implements TV{
	// init-method
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("삼성 TV 기본생성 1");
	}
	/* 생성자를 이용한 의존성 처리
	public SamsungTV(Speaker speaker) {
		System.out.println("삼성 TV 스피커 생성 2");
		this.speaker=speaker;
	}
	
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("삼성 TV 스피커/가격 생성 3");
		// 다중 변수 매핑
		this.speaker = speaker;
		this.price = price;
	}
	*/
	
	
	public void tvinit() {
		System.out.println("삼성 TV 초기화");
		
		
	}

	public Speaker getSpeaker() {
		return speaker;
	}


	public void setSpeaker(Speaker speaker) {
		System.out.println("삼성 set Speaker");
		this.speaker = speaker;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		System.out.println("삼성 set Price");
		this.price = price;
	}


	public void powerOn() {
		
		System.out.println(price+" 짜리 삼성 TV 켜짐");
	}
	public void powerOff() {
		System.out.println("삼성 TV 꺼짐");
	}
	public void volUp() {
		//System.out.println("삼성 TV 볼륨 up");
		//speaker= new SonySpeaker();의존성 없이 직접 생성
		speaker.vUp();// 다른 스피커로 교체
	}
	public void volDown() {
		//System.out.println("삼성 TV 볼륨 Down");
		//speaker= new SonySpeaker(); 의존성 없이 직접 생성
		speaker.vDown();
	}
	// destroy-methond
	public void tvkill() {
		System.out.println("삼성 TV 다이");
	}
}
