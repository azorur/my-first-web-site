package chap99_homework.hw231020;

import java.util.Scanner;

import chap99_homework.hw231020.reverse.Reverse;

public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		1. Reverse라는 클래스를 만들고 메소드로 
//		   String reverseString(String str)를 만듭니다.
//		    매개변수로 받은 str을 거꾸로 만든 String을 리턴하도록 만드세요.
		Reverse reverse = new Reverse();
		
		System.out.print("문자열을 입력하세요.");
		String str1 = sc.nextLine();
		
		System.out.println(reverse.reverseString(str1));
		
//		2. 사용자가 입력한 문자열에서 중복된 문자를 제거한 문자열을 출력하세요.
		System.out.print("문자열을 입력하세요.");
		String str2 = sc.nextLine();
		String str3 = "";
		
		for(int i = 0; i < str2.length(); i++) {
			boolean isDuplicated = false;

			if(i > 0) {
				for(int j = 0; j < i; j++) {
					if(str2.charAt(i) == str2.charAt(j)) {
						isDuplicated = true;
					}
				}
			}

			if(!isDuplicated) {
				str3 += str2.charAt(i);
			}
		}
		
		System.out.println(str3);
		
//		3. 사용자가 입력한 문자열에서 3의 배수 자리의 문자는 3으로 
//		5의 배수 자리의 문자는 5로 변경하여 출력하세요.
		System.out.print("문자열을 입력하세요.");
		String str4 = sc.nextLine();
		String str5 = "";
		
		for(int i = 0; i < str4.length(); i++) {
			if(i != 0 && i % 3 == 0) {
				str5 += '3';
			} else if(i != 0 && i % 5 == 0) {
				str5 += '5';
			} else {
				str5 += str4.charAt(i);
			}
		}
		
		System.out.println(str5);
		
		sc.close();
	}

}
