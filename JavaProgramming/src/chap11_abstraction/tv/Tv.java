package chap11_abstraction.tv;

public abstract class Tv {
	public int lastChannel = 10;
	
	//추상클래스의 생성자는 자식클래스에서 사용가능하다.
	public Tv() {
		lastChannel = 1;
	}
	//생성자에서 변수 초기화와 클라스 변수 초기화?
	
	
	public Tv(int lastChannel) {
		this.lastChannel = lastChannel;
	}
	
	//추상메소드 선언
	public abstract void powerOn();
	public abstract void powerOff();
	public abstract void operate(int channel);
	public abstract void moveTo(int channel);
	
	public void channelUp() {
		this.lastChannel++;
	}
	
	public void channelDown() {
		this.lastChannel--;
	}
}
