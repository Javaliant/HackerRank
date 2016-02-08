import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(isPangram(input.nextLine().toLowerCase()) ? "pangram" : "not pangram");
	}

	private static boolean isPangram(String input) {
		char[] alphabet = {
			'a',
			'b',
			'c',
			'd',
			'e',
			'f',
			'g',
			'h',
			'i',
			'j',
			'k',
			'l',
			'm',
			'n',
			'o',
			'p',
			'q',
			'r',
			's',
			't',
			'u',
			'v',
			'w',
			'x',
			'y',
			'z'
		};

		for (char letter : alphabet) {
			if (input.indexOf(letter) == -1) {
				return false;
			}
		}
		return true;
	}
}