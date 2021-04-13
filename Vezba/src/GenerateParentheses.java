import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public static void main(String[] args) {
		System.out.println(generateParenthesis(15).toString());

	}



	public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        recursive("", n, n);
        return res;
    }

    public static void recursive(String thesis, int left, int right) {
    	List<String> res = new ArrayList<>();
        if (left <=0 && right <=0) {
            res.add(thesis);
            return;
        }
        if (left == right) {
            recursive(thesis + "(", left - 1, right);
            return;
        }

        if (left < right) {
            if (left > 0) {
                recursive(thesis + "(", left -1, right);
            }
            if (right > 0) {
                recursive(thesis + ")", left, right -1);
            }
        }
    }




	}


