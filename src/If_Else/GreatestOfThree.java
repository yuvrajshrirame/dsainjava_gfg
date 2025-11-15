package If_Else;

import java.util.Scanner;
import java.lang.Math;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter number 3: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) System.out.println(n1 + " is greatest");
        else if (n2 > n1 && n2 > n3) System.out.println(n2 + " is greatest");
        else System.out.println(n3 + " is greatest");

        // using nested if else (main logic)

        if (n1 > n2){
            if (n1 > n3){
                System.out.println(n1);
            } else {
                System.out.println(n3);
            }
        } else {
            if (n2 > n3){
                System.out.println(n2);
            } else
                System.out.println(n3);
        }

        // using predefined function

        if (n1 > Math.max(n2, n3)){
            System.out.println(n1);
        } else if (n2 > Math.max(n1,n3)){
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }

    }
}
