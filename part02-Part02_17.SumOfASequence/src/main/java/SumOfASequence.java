
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int number = Integer.valueOf(scanner.nextLine());
        int sum = number;
        for (int i = 0; i < number; i++) {
            System.out.println(i);
            sum += i;
        };

        System.out.println("The sum is " + sum);
    }
}
