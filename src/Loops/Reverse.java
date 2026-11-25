package Loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int r=0;
        int sum=0;
        while (n!=0){
            sum+=n%10;
            r*=10;


            r+=(n%10);
            n/=10;
        }
        System.out.println(r);
        System.out.println(sum);
    }
}
