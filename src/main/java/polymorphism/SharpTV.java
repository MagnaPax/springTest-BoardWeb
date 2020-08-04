package polymorphism;

public class SharpTV implements TV {

	public void powerOn() {
		System.out.println("Sharp TV On");
	}

	public void powerOff() {
		System.out.println("Sharp TV Off");
	}

	public void volUp() {
		System.out.println("Sharp volume Up");
	}

	public void volDown() {
		System.out.println("Sharp volume Down");
	}

}
