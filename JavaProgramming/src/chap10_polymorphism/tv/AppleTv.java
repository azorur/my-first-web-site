package chap10_polymorphism.tv;

public class AppleTv extends Tv{
	public void testTv() {
		super.powerOn();
		super.operate(5);
		super.powerOff();
		super.channelUp();
	}
}
