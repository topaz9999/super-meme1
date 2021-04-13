
public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		System.out.println(isPalindrom("udovicabacivodu"));
		System.out.println(longestPalindromicSubstring("yyyyyyxaudovicabacivoduaxxxx"));

	}

	public static String longestPalindromicSubstring(String s) {
		String temp = "";
		String res = "";
		int counter = 0;

		for (int i = 0; i < s.length() - 1; i++) {

			for (int j = s.length(); j > i; j--) {
				temp = s.substring(i, j);
				if (isPalindrom(temp)) {
					if (temp.length() > counter) {
						counter = temp.length();
						res = temp;
					}
				} 
			}
		}
		System.out.println(counter);
		return res;
	}

	public static boolean isPalindrom(String s) {

		s = s.toLowerCase();

		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}

		return true;
	}




	}


