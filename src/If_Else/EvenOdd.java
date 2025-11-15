package If_Else;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num%2==0) System.out.println("even");
        else System.out.println("odd");

        /*
        if (num % 2 == 0){
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
         */
    }
}
