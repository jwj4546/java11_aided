package sec1;

class StudentMap<K, V> {
	private K key;
	private V value;
	
	public  StudentMap() {}
	
	public StudentMap(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}

public class GenericExam2 {
	public static void main(String[] args) {
		StudentMap<Integer, String> s1 = new StudentMap<>(1, "조우진");
		StudentMap<Integer, String> s2 = new StudentMap<>(2, "박성은");
		StudentMap<Integer, String> s3 = new StudentMap<>(3, "계성우");
		StudentMap<Integer, String> s4 = new StudentMap<>(4, "김동연");
		
		StudentMap<String, Integer> s5 = new StudentMap<>("조우진", 100);
		StudentMap<String, Integer> s6 = new StudentMap<>("박성은", 90);
		
		Student st1 = new Student("김민식", 25);
		StudentMap<Student, Integer> s7 = new StudentMap<>(st1, 80);
	}
}
