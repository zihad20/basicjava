package do_while_loop_and_String;

import java.util.Scanner;

public class Problem_2{
    public static void main(String[] args) {
        int l=2, h, i, ct;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your input: ");
         h = scanner.nextInt();
        System.out.print("Range of prime numbers from 2 to "+h+" are:");
        while (l < h) {
            ct = 0;
            if (l <= 1) {
                ++l;
                continue;
            }
            for (i = 2; i <= l / 2; ++i) {
                if (l % i == 0) {
                    ct = 1;
                    break;
                }
            }

            if (ct == 0)
            System.out.print(" "+l);
            ++l;
        }
    }
}
