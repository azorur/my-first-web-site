package chap12_interface.device;

public class LgTv extends ElecktronicDevise implements Tv {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("LgTv 소리가 들리넹");

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("LgTv 화면이 보이넹");

	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("LgTv" + channel + "초 채널을 변경했쏘다");
	}
}
