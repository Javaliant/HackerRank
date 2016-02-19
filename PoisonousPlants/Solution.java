/* Author: Luigi Vincent */

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] garden = new int[input.nextInt()];
		for (int i = 0; i < garden.length; i++) {
			garden[i] = input.nextInt();
		}

		int days = 0;
		while(killCommand(garden)) {
			days++;
		}

		System.out.println(days);
	}

	private static boolean killCommand(int[] garden) {
		boolean plantDied = false;
		int lastIndex = garden.length - 1;
		int last = garden[lastIndex];

		for (int i = lastIndex - 1; i >= 0; i--) {
			if (garden[i] == -1) {
				continue;
			}
			int current = garden[i];
			if (current < last)	{
				plantDied = true;
				garden[lastIndex] = -1;
			}
			last = current;
			lastIndex = i;
		}

		for (Integer target : targets) {
			garden[target] = -1;
		}

		return plantDied;
	}
}