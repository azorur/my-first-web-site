package chap12_interface.board;

public class NotiesBoard implements Board {

	@Override
	public void insertBoard() {
		System.out.println("공지사항 게시글 등록.");
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBoard() {
		// TODO Auto-generated method stub
		System.out.println("공지사항 게시글 삭제.");

	}

	@Override
	public void updateBoard() {
		// TODO Auto-generated method stub
		System.out.println("공지사항 게시글 수정.");

	}

	@Override
	public void selectBoard() {
		// TODO Auto-generated method stub
		System.out.println("공지사항 게시글 조회.");

	}

}
