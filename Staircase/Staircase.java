


import java.util.Scanner;


public class Staircase {
	public static void main(String[] args) {
		//int numberOfStairs = new Scanner(System.in).nextInt();
		int numberOfStairs = 5;
		StringBuilder stairBuilder = new StringBuilder();

		for (int i = 1; i <= numberOfStairs; i++) {
			System.out.println(getStair(i, numberOfStairs));
		}
	}


	private static String getStair(int level, int numberOfStairs) {
		StringBuilder stairBuilder = new StringBuilder();
		char stair = '#';

		for (int i = numberOfStairs; i >= 1; i--) {
			stairBuilder.append(i <= level ? stair : ' ');
		}

		return stairBuilder.toString();
	}
}