package sec2;

public class Member {
	private int mno;
	private String mname;
	private int mage;
	private int point;
	
	public Member() {}
	public Member(int mno, String mname, int mage, int point) {
		super();
		this.mno = mno;
		this.mname = mname;
		this.mage = mage;
		this.point = point;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMage() {
		return mage;
	}
	public void setMage(int mage) {
		this.mage = mage;
	}
	public int getpoint() {
		return point;
	}
	public void setpoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "Member [mno=" + mno + ", mname=" + mname + ", mage=" + mage + ", point=" + point + "]";
	}
}
