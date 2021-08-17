package do_while_loop_and_String;
//Write a program to sum of digits of a number by taking from user input
import java.util.Scanner;

public class Problem_1{
    public static void main(String[] args) {
        int digitSummation=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your input: ");
        int digit = scanner.nextInt();
        while (digit>0){
            int reminder = digit % 10;
            digitSummation+=reminder;
            digit/=10;
        }
        System.out.println("This is your sum of digits: "+digitSummation);
    }
}
