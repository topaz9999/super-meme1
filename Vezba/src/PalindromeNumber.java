
public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(palindromeNumber(112343211));

	}

	public static boolean palindromeNumber(int number) {
		int temp = number;
		int pln = 0;
		while (temp > 0) {
			pln = pln * 10 + (temp % 10);
			temp /= 10;
		}

		return pln == number;
	}




	}


