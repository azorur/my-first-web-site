package chap99_homework.hw231019.mammal;

//포유류를 상속받고 밑에 고양이과를 상속받는 클래스 
public class Lion extends Cat{
	Lion() {
		super("사자");
	}
	
	public void hunt() {
		System.out.println(this.race + "는(은) 사냥을 합니다.");
	}

	public void run() {
		System.out.println(this.race + "는(은) 달립니다.");
	}
}
