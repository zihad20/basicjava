package ifElse_and_Loop;

import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        int count =1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your input: ");
        int n = scanner.nextInt();
        if (n>=2) System.out.println("2");
        for(int i = 3; i <= n; i++){
            int ct = 0;
            for(int j = 2; j <= i/2; j++){
                if(i%j==0){
                    ct=1;
                    break;
                }
            }
            if(ct==0){
                System.out.println(i);
            }


        }

    }
}
