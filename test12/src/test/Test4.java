package test;

class Person{
	String name;
	public Person() { }
	public Person(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [pname=" + name + "]";
	}
}

public class Test4 {
	public static void main(String[] args) {
		
		Person[] pArr = new Person[3]; 						
		pArr[0] = new Person("cho");						//비어 있거나 초기화 되어 있지 않은 pArr 배열에 Person 객체를 생성하여 각 요소에 생성된 객체를 대입
		pArr[1] = new Person("kim");
		pArr[2] = new Person("jeong");
				
		for(int i=0;i<pArr.length;i++) {						//실제 선언한 배열의 개수보다 더 많은 수의 반복 실행이 된다.(요청한 횟수가 배열 수보다 더 크다) => ArrayIndexOutOfBoundsException 발생 
			System.out.println(pArr[i].getName());						//Person의 배열요소인 pArr 객체가 초기화(값이 대입)되어 있지 않아 => NullPointerException
		}
	}

}
