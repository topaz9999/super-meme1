import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofPhoneNumber {

	public static void main(String[] args) {
		List<String> lista = letterCombinations(202365);

		System.out.println(lista.toString());
		System.out.println(lista.size());

	}

	public static List<String> letterCombinations(int num) {
		String[] letters = { "0", "1", "abc", "def", "gfi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		List<String> result = new ArrayList<String>();
		int pos1 = (num / 10) % 10;
		int pos2 = num % 10;

		String a = letters[pos1];
		String b = letters[pos2];
		String str = "";
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				str = String.valueOf(a.charAt(i)) + String.valueOf(b.charAt(j));
				result.add(str);
			}
		}

		if (num < 100) {
			return result;
		}

		num /= 100;

		while (num > 0) {
			List<String> temp = new ArrayList<String>();
			pos1 = num % 10;
			a = letters[pos1];
			for (int i = 0; i < a.length(); i++) {
				for (int j = 0; j < result.size(); j++) {
					str = String.valueOf(a.charAt(i)) + result.get(j);
					temp.add(str);
				}
			}
			result.clear();
			result.addAll(temp);
			num = num / 10;
		}

		return result;
	}

	}


