package do_while_loop_and_String;

import java.util.Scanner;

//Write a program to make a digital tasbih where the program counts each time user press enter until press 0
public class Problem_3 {
    public static void main(String[] args) {
        int Count=0;
        System.out.println("Please Enter any integer for tasbih Count: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int intNumber=scanner.nextInt();
            if(intNumber==0){
                break;
            }
            Count++;
            System.out.println("Total Count is : "+Count);
        }

    }
}
