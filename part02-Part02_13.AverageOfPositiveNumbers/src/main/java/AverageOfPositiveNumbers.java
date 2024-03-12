
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfNums = 0;
        int sumOfNums = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number > 0) {
                numOfNums += 1;
                sumOfNums += number;
            } else if (number == 0) {
                if (sumOfNums != 0) {
                    System.out.println(((sumOfNums/(double) numOfNums)));
                } else {
                    System.out.println("Cannot calculate the average");
                }
                break;
            }
        }
    }
}
