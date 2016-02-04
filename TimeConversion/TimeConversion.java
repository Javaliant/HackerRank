import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int endPoint = input.length() - 2;

		if (input.indexOf("AM") != -1) {
			if (input.startsWith("12")) {
				System.out.println(input.replaceFirst("12", "00").substring(0, endPoint));
			} else {
				System.out.println(input.substring(0, endPoint));
			}
		} else {
			if (input.startsWith("12")) {
				System.out.println(input.substring(0, endPoint));
			} else {
				System.out.println(
					(Integer.parseInt(input.substring(0, 2)) + 12)
					+ input.substring(2, endPoint)
				);
			}	
		}
	}
}