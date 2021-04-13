
public class StringToInteger {

	public static void main(String[] args) {
		System.out.println(stringToInteger("               -1234567890dfgdfg             "));

	}

	public static int stringToInteger(String str) {
		int res = 0;
		int znak = 1;
		String ch = "abcdefghijklmnopqrstvuwxyz ";
		str = str.trim();
		if (ch.contains(String.valueOf(str.charAt(0)))) {
			return 0;
		}
		if (str.charAt(0) == '-') {
			znak = -1;
			str = str.substring(1);
		}
		for (int i = 0; i < str.length(); i++) {

			if (ch.contains(String.valueOf(str.charAt(i)))) {

				break;
			} else {
				res = res * 10 + Integer.parseInt(String.valueOf(str.charAt(i)));
			}
		}
		res *= znak;
		if (res < Integer.MIN_VALUE) {
			res = Integer.MIN_VALUE;
		}
		if (res > Integer.MAX_VALUE) {
			res = Integer.MAX_VALUE;
		}
		return res;
	}




	}


