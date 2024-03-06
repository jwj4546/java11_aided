package sec1;

public class GenericExam {
	public static void main(String[] args) {
		//생성자에 대한 제네릭의 타입 생략 가능 - 자바 1.7 이상
		Generic1<Student> s = new Generic1<>();
		Student a = new Student("장원영", 21);
		s.setField1(a);
		
		Generic1<Teacher> t= new Generic1<>();
		Teacher b = new Teacher("카리나", 25);
		t.setField1(b);
		
		//Generic1<int> i = new Generic1<>(); => 기본 타입 불가능
		Generic1<Integer> i = new Generic1<>();
		i.setField1(1004);
		
		Generic1<String> str = new Generic1<>();
		str.setField1("조우진");
	}
}
