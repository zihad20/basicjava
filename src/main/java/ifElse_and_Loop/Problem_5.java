package ifElse_and_Loop;

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your input: ");
        int value = scanner.nextInt();
        for(int i=1;i<=10;i++){
            int multi=value*i;
            System.out.println(value+"*"+i+" = "+multi);
        }
    }
}
