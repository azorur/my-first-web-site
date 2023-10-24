package chap13_nestedclass.nestedclass;

public class LocalNestedClass {
	public void speedUp() {
		//1. 지역 중첩 클래스는 메소드 안에서 선언하고
		//메소드 안에서 객체를 만들어서 사용한다.
		//메소드의 호출이 끝나면 메모리에서 삭제되기 때문에
		//다른 곳에서 이 클래스를 접근 또는 사용이 불가능 하다.
		class Engine {
			int fquelAmount;
			
			public Engine(int fuelAmount) {
				this.fquelAmount = fquelAmount;
				
			}
			
			public void useFquelAmount() {
				this.fquelAmount -= 10;
			}
		}
		
		Engine eg = new Engine(100);
		
		eg.useFquelAmount();
		System.out.println("연료가" + eg.fquelAmount+"% 남았습니다.");
	
}
}
