package sec2;

public class Board {
	private int bno;
	private String bname;
	private String title;
	private int cnt;
	
	public Board() { }
	public Board(int bno, String bname, String title, int cnt) {
		super();
		this.bno = bno;
		this.bname = bname;
		this.title = title;
		this.cnt = cnt;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}
