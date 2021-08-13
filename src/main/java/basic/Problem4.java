package basic;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Input your Maximum Range: ");
        int max = scanner.nextInt();
        System.out.println("Please Input your Minimum Range: ");
        int min = scanner.nextInt();
        double value=Math.random() * (max - min) + min;
        int result=(int)value;
        System.out.println("This is your Random Number: "+result);
    }
}
