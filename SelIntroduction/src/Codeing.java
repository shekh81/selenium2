
public class Codeing {

	public static void main(String[] args) {
		System.out.println("Hello Java");
		String s = "ABCD";
		String revS ="";
		for (int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			revS = c+revS;
			System.out.println(revS);
		}
	}
}




