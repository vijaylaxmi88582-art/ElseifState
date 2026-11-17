package ElseIfState;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter cost price:");
        int cp=sc.nextInt();
        System.out.println("Enter selling price :");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println("profit is ="+(sp-cp) + " " + "profit % is=" +((sp-cp)*100)/cp);
        }
        else {
            System.out.println("Loss is = "+ (cp-sp));
        }
    }
}
