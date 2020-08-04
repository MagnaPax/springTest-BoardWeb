package annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("ltv")
public class LgTva implements TVa {

	private String comp = "LG";
	/*
	@Autowired
	@Qualifier("yamaha")
	2개의 기능을 합친것이 @Resource
	*/
	@Resource(name = "yamaha")
	private SpeakerA speaker;

	public LgTva() {
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
		speaker.vDown();
	}

}
