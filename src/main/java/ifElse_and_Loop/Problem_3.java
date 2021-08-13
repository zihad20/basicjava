package ifElse_and_Loop;

//Create a math quiz program. Scenario: 2 numbers will generate randomly and prompt user to input the summation of 2 numbers. If user inputs the correct summation, print "Answer is correct" and user will get 1 point. if user inputs wrong summation,  then user will get 0 point. Finally after 5 iteration, total score will be shown.
import java.util.Scanner;
import java.util.Random;

public class Problem_3 {
    public static void main(String[] args) {
        int sum;
        int point=0;
        Scanner scanner=new Scanner(System.in);
        Random rand = new Random();
        for(int i=1;i<=5;i++){
            int value1 = rand.nextInt(50);
            int value2 = rand.nextInt(50);
            sum=value1+value2;
            System.out.println("Question "+i+":");
            System.out.println("What is the sum of "+value1+" and "+value2+"?");
            int result=scanner.nextInt();
            if (sum==result){
                System.out.println("Correct!");
                point++;
            }else{
                System.out.println("Wrong");
            }
        }
        System.out.println("Quiz end! Your Total Score is "+point+" out of 5");
    }
}
