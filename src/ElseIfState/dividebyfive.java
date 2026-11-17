package ElseIfState;

import java.util.Scanner;

public class dividebyfive {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number :");
        int a= sc.nextInt();
        if(a%5==0){
            System.out.println("Divide by 5");
        }
        else {
            System.out.println("Not divide by 5 ");
        }



    }
}
