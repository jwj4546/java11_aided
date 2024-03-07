package good;

public class Subject {
	private int code;
	private String style;
	private String name;
	public Subject() { }
	public Subject(int code, String style, String name) {
		super();
		this.code = code;
		this.style = style;
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Subject [code=" + code + ", style=" + style + ", name=" + name + "]";
	}
}
