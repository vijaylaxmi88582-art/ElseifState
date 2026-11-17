package ElseIfState;

import java.util.Scanner;

public class fourDigitnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        if(n>999 && n<10000){
            System.out.println("4 digit number ");
        }
        else {
            System.out.println("not a four digit number");
        }
    }
}
