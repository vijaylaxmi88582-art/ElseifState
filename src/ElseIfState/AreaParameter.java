package ElseIfState;

import java.util.Scanner;

public class AreaParameter {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter length: ");
        int a= sc.nextInt();
        System.out.print("Enter breath: ");
        int b= sc.nextInt();
        int parameter= 2*(a+b);
        int Area = a*b;
        if(parameter>Area){
            System.out.print("parameter is greather than area");
        }
        else {
            System.out.print("Area is greather than paremeter");
        }

    }
}
