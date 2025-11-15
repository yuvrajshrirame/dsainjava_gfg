package Basic_Cheeze.Homework;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        int n1, n2;
        System.out.print("Enter 1st Number: ");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        n2 = sc.nextInt();

        System.out.println("Sum: " + (n1 + n2));
    }
}
