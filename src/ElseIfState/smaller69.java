package ElseIfState;

import java.util.Scanner;

public class smaller69 {
    public static  void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        if (a>69){
            System.out.println("not smaller then 69");
        }
        else {
            System.out.println("smaller than ");
        }
    }
}
