package If_Else;

import java.util.Scanner;

public class ElseIfLadder {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("divisible by 3 and 5");
        }
        else if (num % 5 == 0) {
            System.out.println("divisible by 5");
        }
        else if (num % 3 == 0) {
            System.out.println("divisible by 3");
        }
        else {
            System.out.println("divisible by 3 or 5");
        }
    }
}
