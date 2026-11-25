package Loops;

import java.util.Scanner;

public class sumofDigit {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a nuber :");
        int n = sc.nextInt();
        int sum=0;
        while (n!=0){
           sum+=n%10;
           n/=10;


        }
        System.out.println(sum);




    }
}
