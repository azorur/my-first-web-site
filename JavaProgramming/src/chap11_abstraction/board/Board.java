package chap11_abstraction.board;

//2. 형태만 있느 추상 메소드를 만드려면 추상 클래스 선언을 해야 한다.
//추상 클래스는 객체를 만들 수 없다(인스턴스가 불가능 하다.)
//추상 클래스는 메모리가 없기에 상속받을 자식 클래스가 무조건 있어야 한다.

public abstract class Board {
	//이는 필드, 속성, 변수 선언, 인스턴스 변수 라고 함
	//전역변수는 static으로 선언된 변수
	private int boardNo;
	String boardTitle;
	String boardContent;
	String boardWriter;
	String boardDate;
	
	//alt+shift+s
	
	//기본 생성자
	public Board() {
		super();
	}
	
	// 인스턴스 메소드 
	public Board(int boardNo, String boardTitle, String boardContent, String boardWriter, String boardDate) {
		super();
		
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardWriter = boardWriter;
		this.boardDate = boardDate;
	}

	// 인스턴스 메소드 
	//저장된 정보를 가져올 수 있는 get 메소드	
	public int getBoardNo() {
		return boardNo;
	}

	// 인스턴스 메소드 
	//저장된 정보를 수정할 수 있는 set 메소드
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}
	
	// 1. 부모타입으로 자식객체를 사용하면 오버라이딩된 기능은 부모클래스에 존재하는 기능이 전혀 동작하지 않기 때문에 부모에는 껍데기(형태)만 만들어 놓은다. => 추상화
	// 3. 추상 메소드는 상속받은 자식 클래스에서 오버라이드로 동작을 만들어줘야 한다. (구현 필수)
	
	public abstract void insertBoard();
	
	

}
