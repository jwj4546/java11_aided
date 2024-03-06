package sec2;

public class StringBuilderExam {
	public static void main(String[] args) {
		String str = new String("Java Programmer");
		str += 11;
		str += " Programmer";
		str += " Junior Level ";
		str += "Develope ";
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Java");
		sb.append(11);
		sb.append(" Programmer");
		sb.insert(6, " Web");					//중간에 끼워넣기
		sb.insert(0, "KH ");					//처음에 끼워넣기
		System.out.println(sb);
	}
}
