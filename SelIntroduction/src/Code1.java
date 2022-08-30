
public class Code1 {

	public static void main(String[] args) {
		//Reverse String
		String s = "ABCD";
		String revS = "";
		for(int i = 0; i<s.length();i++) {
		char c = s.charAt(i);
		revS = c+revS;
		}
	}
}
