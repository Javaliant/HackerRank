import java.util.Scanner;

public class ArrayDS {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.nextLine(); // skip unecessary line.
		String[] numbers = input.nextLine().split("\\s+");
		StringBuilder reversed = new StringBuilder();

		for (int i = numbers.length - 1; i >= 0; i--) {
			reversed.append(' ').append(numbers[i]);
		}

		System.out.println(reversed.substring(1));
	}
}