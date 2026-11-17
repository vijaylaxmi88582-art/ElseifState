package ElseIfState;

import java.util.Scanner;

public class interger {
    public static void main(String[] args){
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter Number : ");
        double n =sb.nextDouble();
        int x=(int)n;
        if(n- x >0) System.out.println("Not an integer");
        else System.out.println("is an integer");
    }
}
