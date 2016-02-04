import java.util.Scanner;

public class SimpleArraySum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt() // skip first input 'size' - unecessary
        int sum = 0;
        
        while (in.hasNextInt()) {
            sum += in.nextInt();
        }
        System.out.println(sum);
    }
}