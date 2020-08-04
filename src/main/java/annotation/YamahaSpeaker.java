package annotation;

import org.springframework.stereotype.Component;

@Component("yamaha")
public class YamahaSpeaker implements SpeakerA {
	private String comp = "Yamaha";

	public YamahaSpeaker() {
		System.out.println(comp + "스피커 생성");
	}

	@Override
	public void vUp() {
		System.out.println(comp + "스피커 볼륨 Up");
	}

	@Override
	public void vDown() {
		System.out.println(comp + "스피커 볼륨 Down");
	}
}
