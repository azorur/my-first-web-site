package chap04_controlstatement;

public class _10_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. continue
		for(int i = 0; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("-----------------");
		
		int j = 0;
		
		while(j <= 10) {
			j++;
			
			if(j % 2 == 0) {
				continue;
			}
			
			System.out.println(j);
		}
	}

}
