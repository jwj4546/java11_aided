package good;

public class Student {
	private int no;
	private String name;
	private Subject subject;
	public Student() { }
	public Student(int no, String name, Subject subject) {
		super();
		this.no = no;
		this.name = name;
		this.subject = subject;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", subject=" + subject + "]";
	}
}
