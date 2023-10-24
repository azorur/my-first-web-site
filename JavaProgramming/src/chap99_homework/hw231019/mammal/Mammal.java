package chap99_homework.hw231019.mammal;

public class Mammal {
	String race;
	
	//매개변수가 없는 생성자
	Mammal() {
		System.out.println(race + "는(은) 포유류과입니다.");
	}
	
	//매개변수가 있는 생성자
	Mammal(String race) {
		this.race = race;
		System.out.println(race + "는(은) 포유류과입니다.");
	}
	
	public void calve() {
		System.out.println(race + "는(은) 새끼를 낳습니다.");
	}

	public void sleep() {
		System.out.println(race + "는(은) 잠을 잡니다.");
	}
}
