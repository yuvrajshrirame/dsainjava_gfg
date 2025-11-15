package If_Else;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CP: ");
        int cp = sc.nextInt();
        System.out.print("Enter SP: ");
        int sp = sc.nextInt();

        if (cp > sp){
            int loss = cp - sp;
            System.out.println("Loss of " + loss + "rs.");
        } else if (cp == sp) {
            System.out.println("No profit, no loss");
        } else {
            int profit = sp - cp;
            System.out.println("Profit of " + profit + "rs.");
        }
    }
}
