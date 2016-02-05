import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class QHeap1 {
	int minimum = Integer.MAX_VALUE;
	Set<Integer> set = new HashSet<>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		QHeap1 qHeap = new QHeap1();

		for (int i = Integer.parseInt(input.nextLine()); i > 0; i--) {
			String query = input.nextLine();
			if (query.startsWith("1")) {
				qHeap.add(Integer.valueOf(query.split("\\s")[1]));
			} else if (query.startsWith("2")) {
				qHeap.remove(Integer.valueOf(query.split("\\s")[1]));
			} else {
				System.out.println(qHeap.minimum);
			}
		}
	}
	
	private void add(Integer value) {
		set.add(value);
		if (value < minimum) {
			minimum = value;
		}
	}

	private void remove(Integer value) {
		set.remove(value);
		if (minimum == value) {
			minimum = Integer.MAX_VALUE;
			for (Integer newMin : set) {
				if (newMin < minimum) {
					minimum = newMin;
				}
			}
		}
	}
}