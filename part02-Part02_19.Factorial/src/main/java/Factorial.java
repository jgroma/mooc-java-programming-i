
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        int factorialNum = 1;

        if (number == 0) {
            System.out.println("Factorial: 1");
        } else {
            for (int i = 1; i <= number; i++) {
                factorialNum *= i;
            }

            System.out.println("Factorial: " + factorialNum);
        }
    }
}
