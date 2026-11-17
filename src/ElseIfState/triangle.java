package ElseIfState;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args){
        Scanner sb= new Scanner(System.in);
        System.out.print("Enter first  Number : ");
        int a =sb.nextInt();
        System.out.print("Enter second  Number : ");
        int b =sb.nextInt();
        System.out.print("Enter third  Number : ");
        int c =sb.nextInt();
        if((a+b)>c && (b+c)>a && (a+c)>b){
            System.out.print("valid Triangle");
        }
        else {
            System.out.print("Invalid Triangle");
        }
    }

}
