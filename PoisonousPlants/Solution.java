import java.util.ArrayList;
import java.util.List;
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
		int last = garden[0];
		List<Integer> targets = new ArrayList<>();

		for (int i = 1; i < garden.length; i++) {
			if (garden[i] == -1) {
				continue;
			}
			
			int current = garden[i];
			if (current > last)	{
				plantDied = true;
				targets.add(i);
			}
			last = current;
		}

		for (Integer target : targets) {
			garden[target] = -1;
		}

		return plantDied;
	}
}