/* Author: Luigi Vincent */

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.nextLine(); // skip unecessary first line

		while (input.hasNextLine()) {
			System.out.println(countDivisibleDigits(input.nextLine()));
		}
	}

	private static int countDivisibleDigits(String input) {
		int count = 0;
		int value = Integer.parseInt(input);

		for (int i = 0; i < input.length(); i++) {
			int digit = Character.digit(input.charAt(i), 10);
			if (digit != 0 && value % digit == 0) {
				count++;
			}
		}

		return count;
	}
}