package Loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // fact
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact *= i;
        }

        System.out.println(fact);

    }
}
