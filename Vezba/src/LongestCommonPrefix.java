import java.util.HashMap;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] arr = { "flower", "flow", "flight", "arow", "array", "argon", "arcanzas" };

		System.out.println(longestCommonPrefix(arr));

	}

	public static String longestCommonPrefix(String[] strs) {
		Integer max = 1;
		Integer val = 0;
		String res = "";
		String[] prefixes = new String[strs.length];
		HashMap<String, Integer> prefixesCount = new HashMap<String, Integer>();

		for (int i = 0; i < strs.length; i++) {
			prefixes[i] = strs[i].substring(0, 2);
			if (prefixesCount.containsKey(prefixes[i])) {
				val = prefixesCount.get(prefixes[i]) + 1;
				prefixesCount.replace(prefixes[i], val);
			} else {
				prefixesCount.put(prefixes[i], 1);
			}

			if (val > max) {
				max = val;
				res = prefixes[i];
			}

		}
		return res;

	}



	}


