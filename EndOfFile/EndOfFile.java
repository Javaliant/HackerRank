import java.util.Scanner;

public class EndOfFile {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lineNumber = 1;
		while (in.hasNextLine()) {
			System.out.println(lineNumber++ + " " + in.nextLine());
		}
	}
}