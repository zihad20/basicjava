package basic;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Input a: ");
        int a = scanner.nextInt();
        System.out.println("Please Input b: ");
        int b = scanner.nextInt();
        //int sum= a+b;
        int square = (int) Math.pow(a + b, 2);
        System.out.println("(a+b)^2: " + square);
    }
}
