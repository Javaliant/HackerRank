import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class TwoStrings {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i = Integer.parseInt(input.nextLine()); i > 0; i--) {
			String sub1 = toDiscreteString(input.nextLine());
			String sub2 = toDiscreteString(input.nextLine());
			boolean success;
			if (sub1.length() < sub2.length()) {
				success = hasCommonSubString(sub1, sub2);
			} else {
				success = hasCommonSubString(sub2, sub1);
			}
			System.out.println(success ? "YES" : "NO");
		}
	}

	private static boolean hasCommonSubString(String shorter, String longer) {
		for (int i = 0; i < shorter.length(); i++) {
			if (longer.indexOf(shorter.charAt(i)) > -1) {
				return true;
			}
		}
		return false;
	}

	private static String toDiscreteString(String input) {
		Set<Character> set = new HashSet<>();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			if (set.add(input.charAt(i))) {
				result.append(input.charAt(i));
			}
		}
		return result.toString();
	}
}