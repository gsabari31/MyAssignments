package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String name = "MADAM";
		String name2 = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			name2 = name2 + name.charAt(i);
		}
		System.out.println(name2);
		if (name.equals(name2)) {
			System.out.println(" name is Palindrome");
		} else {
			System.out.println(" name is not a Palindrome");
		}

	}
}
//      name.charat for the character which in place of i
//      abcd wgen i=-- dcba
//      name.equals for string not==