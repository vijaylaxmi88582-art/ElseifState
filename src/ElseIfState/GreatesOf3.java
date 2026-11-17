package ElseIfState;

import java.util.Scanner;

public class GreatesOf3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number :");
        int a =sc.nextInt();
        System.out.print("Enter second number :");
        int b =sc.nextInt();
        System.out.print("Enter third number :");
        int c =sc.nextInt();
        if(a>b && a>c){
            System.out.print("first number is greather");
        } else if (b>a && b>c) {
            System.out.print("Second number is greather ");

        }
        else {
            System.out.print("third number is greather ");
        }
    }
}
