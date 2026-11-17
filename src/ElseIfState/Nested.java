package ElseIfState;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second  number : ");
        int b = sc.nextInt();
        System.out.print("Enter third number : ");
        int c = sc.nextInt();
        if (a >= b) {
            if (a >= c) System.out.println(a);

            else // c>a
                System.out.println(c);

        } else { // b>a
            if (b >= c) System.out.println(b);
            else  // c>b
                System.out.println(c);

        }


    }
}
