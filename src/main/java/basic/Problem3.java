package basic;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Input your 1st Number: ");
        int number1 = scanner.nextInt();
        System.out.println("Please Input your 2nd Number: ");
        int number2 = scanner.nextInt();
        System.out.println("Please Input your 3rd Number: ");
        int number3 = scanner.nextInt();
        int sum = number1 + number2 + number3;
        double avg = sum / 3;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
