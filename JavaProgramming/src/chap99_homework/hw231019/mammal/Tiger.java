package chap99_homework.hw231019.mammal;

//포유류를 상속받고 밑에 고양이과를 상속받는 클래스
public class Tiger extends Cat{
	Tiger() {
		super("호랑이");
	}
	
	public void eat() {
		System.out.println(this.race + "는(은) 고기를 먹습니다.");
	}

	public void swim() {
		System.out.println(this.race + "는(은) 수영을 합니다.");
	}
}
