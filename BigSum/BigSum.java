import java.util.Scanner;

public class BigSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.nextInt(); // ignore first character

		long total = 0L;
		while (input.hasNextInt()) {
			total += input.nextInt();
		}

		System.out.println(total);
	}
}