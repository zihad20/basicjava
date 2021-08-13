package ifElse_and_Loop;

//Write a program that takes a year from user and print whether that year is a leap year or not

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {

        int year;
        boolean isLeap = false;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Year: ");
        year = scanner.nextInt();
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0){
                    isLeap = true;
                }
                else{
                    isLeap = false;
                }
            }
            else{
                isLeap = true;
            }
        }
        else {
            isLeap = false;
        }
        if(isLeap==true){
            System.out.println(year + " is a Leap Year.");
        }
        else{
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
