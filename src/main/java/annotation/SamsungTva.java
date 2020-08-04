package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("stv")
public class SamsungTva implements TVa {

	private String comp = "Samsung";
	/*
	@Autowired
	@Qualifier("tdk")
	2개의 기능을 합친것이 @Resource
	*/
	@Autowired
	@Qualifier("tdk")
	private SpeakerA speaker;

	public SamsungTva() {
		System.out.println(comp + "TVa 생성");
	}

	@Override
	public void powerOn() {
		System.out.println(comp + "TVa 켬");
	}

	@Override
	public void powerOff() {
		System.out.println(comp + "TVa 끔");
	}

	@Override
	public void volUp() {
		//		System.out.println(comp + "TVa 볼륨 업");
		speaker.vUp();
	}

	@Override
	public void volDown() {
		//		System.out.println(comp + "TVa 볼륨 다운");
		speaker.vUp();
	}

}
