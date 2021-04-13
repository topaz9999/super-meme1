
public class RegularExpressionMatching {

	public static void main(String[] args) {
System.out.println(regularExpressionMatching("aab", "c*a*caab"));
		
		

	}

	public static boolean regularExpressionMatching(String s, String p) {

		for (int i = 0; i < p.length(); i++) {

			if (s.charAt(0) == p.charAt(i) || p.charAt(i) == '.' || (p.charAt(i) == '*'
					&& (s.charAt(0) == 0 || (s.charAt(0) == p.charAt(i - 1)) || p.charAt(i - 1) == '.'))) {

				String p2 = p.substring(i);

				if (s.length() > p2.length()) {
					return false;
				}
				int counter = 1;
				for (int j = 1; j < s.length(); j++) {
					
					if (p.charAt(j) == '.') {
						counter++;
						continue;
					}

					if (s.charAt(j) == p2.charAt(j)) {
						counter++;
						continue;
					}
					if (p2.charAt(j) == '*' && ((s.charAt(j) == 0 || (s.charAt(j) == p2.charAt(j - 1))))) {
						counter++;
						continue;
					}
					break;
				}
				if (counter == s.length()) {
					return true;
				}
			}

		}

		return false;
	}
	
	




	}


