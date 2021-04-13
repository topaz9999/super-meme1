
public class LongestSubstring {

	public static void main(String[] args) {
		System.out.println(longestSubstring("abcabcbb"));

	}

	public static int longestSubstring(String s) {
		int max = 0;

		for (int i = 0; i < s.length(); i++) {
			int counter = 0;
			String res = "";
			for (int j = i; j < s.length(); j++) {
				if (res.contains(String.valueOf(s.charAt(j)))) {
					if (counter > max) {
						max = counter;						
					}
					break;
				}
				counter++;
				res += s.charAt(j);
			}
		}

		return max;
	}




	}


