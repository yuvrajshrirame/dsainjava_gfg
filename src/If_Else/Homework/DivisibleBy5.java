package If_Else.Homework;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num % 5 == 0){
            System.out.println(num + " is divisible");
        } else {
            System.out.println(num + " isn't divisible");
        }
    }
}

