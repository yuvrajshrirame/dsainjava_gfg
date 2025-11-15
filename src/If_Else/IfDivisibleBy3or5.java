package If_Else;

import java.util.Scanner;

public class IfDivisibleBy3or5 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 3 == 0 || num % 5 == 0){
            System.out.println("Divisible by 3 or 5");
        }
    }
}
