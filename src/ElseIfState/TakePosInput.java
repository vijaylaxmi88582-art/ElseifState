package ElseIfState;

import java.util.Scanner;

public class TakePosInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a= sc.nextInt();
        System.out.print("Enter Second number:");
        int b= sc.nextInt();
        if(a%5==0 && b%3!=0){
            System.out.println("Riya");
        }
        else if(b%3==0 && a%5!=0){
            System.out.println(" Banu ");
        } else if (a%5==0 && b%3==0) {
            System.out.println("Apurwa");

        } else  {
            System.out.println("Isha");

        }


    }
}
