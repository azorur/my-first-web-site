package chap14_objectarray;

import chap14_objectarray.objectarray.ClassArray;

public class _01_ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 객체 배열의 선언
		ClassArray[] classArray = new ClassArray[3];
		
		// 2. 객체 배열의 각 ㅇ소에는 객체가 저장되어야 한다.
		classArray[0] = new ClassArray("수학",15,90);
		classArray[1] = new ClassArray("영어",55,50);
		classArray[2] = new ClassArray("자바",35,70);
		
		// 3. 객체 배열의 각 요소를 사용하는 방식은
		// 각 요소. 멤버 변수나 멤버메소드를 호출한다.
		classArray[0].proceedLectire();
		classArray[1].proceedLectire();
		classArray[2].proceedLectire();
		
		for(ClassArray ca : classArray) {
			ca.proceedLectire();
		}
	}

}
