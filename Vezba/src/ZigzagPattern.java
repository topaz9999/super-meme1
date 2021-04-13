
public class ZigzagPattern {

	public static void main(String[] args) {
		String s = "PAYPALISHIRINGPAYPALISHIRING";
		zigzagPatern(s, 4);

	}

	public static void zigzagPatern(String s, int columns) {

		int counter = 0;
		int rows = s.length() / columns + 1;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (i == 0) {
					System.out.print(s.charAt(counter));
					counter++;
				} else if (i % (columns - 1) == 0) {
					System.out.print(s.charAt(counter));
					counter++;
				} else if (j == columns - i-1) {
					System.out.print(s.charAt(counter));
					counter++;
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}




	}


