import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int matrixSize = input.nextInt();
        input.nextLine();
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0, j = matrixSize - 1; i < matrixSize; i++, j--) {
			String[] row = input.nextLine().split("\\s+");
			sum1 += Integer.parseInt(row[i]);
			sum2 += Integer.parseInt(row[j]);
		}

		System.out.println(Math.abs(sum1 - sum2));
	}
}