package chap14_objectarray;

import chap14_objectarray.objectarray.English;
import chap14_objectarray.objectarray.InterfaceArray;
import chap14_objectarray.objectarray.MathMetics;
import chap14_objectarray.objectarray.Programming;

public class _02_InterfaceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceArray[] ia = new InterfaceArray[4];
		
		ia[0] = new English("영어", 15, 30);
		ia[1] = new MathMetics("수학", 10, 50);
		ia[2] = new Programming("자바", 10, 45);
		
//		ia[3] = new InterfaceArray(){
//			@Override
//			public void proceedLucture() {
//				System.out.println("111");
//				// TODO Auto-generated method stub
//			}
//			@Override
//			public void learn() {
//				System.out.println("111");
//				// TODO Auto-generated method stub
//			}
//		};
//		
		for(InterfaceArray i : ia) {
			i.proceedLucture();
			i.learn();
		}
		
		
	}

}
