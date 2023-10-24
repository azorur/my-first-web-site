package chap07_class;

import chap07_class.board.Board;

//실행클래스
public class _05_UseOfBoard {

	// 메인 메소드, 클래스 메소드, 스태틱 메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 클래스는 변수로 선언해서 객체를 값으로 받아서 사용한다.
		// 따라서 클래스는 사용자가 직접 만든 타입으로 생각해도 된다.
		Board board;
		
		// 2. 클래스 내의 속성이나 기능들은 객체가 만들어진 후에 사용가능하고
		// 객체.속성명, 객체.기능명으로 사용한다.
		
		// 3. 객체를 만드는 과정은 뉴키워드와 생성자를 통해서 진행된다.
		// 이때 객체가 만들어지고 이는 Board의 인스턴스화와 같다.
		board = new Board();
		board.setBoardNo(1);
		board.setBoardTitle("제목");
		board.setBoardContent("내용");
		
		// 이때, 실행클래스에서 세터로 정보를 보내고
		// 라이브러리 클라스에서는 게터로 정보를 받고 다시 실행클래스로 반환한다.
		System.out.println(board.getBoardNo());
//		printBoardInfo(board);
		printBoardInfo(new Board());
		
		}
	
	public static void printBoardInfo(Board board) {
		System.out.println("게시글번호 : " + board.getBoardNo());

	}

}
