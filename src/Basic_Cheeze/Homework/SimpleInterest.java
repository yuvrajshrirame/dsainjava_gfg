package Basic_Cheeze.Homework;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // si = pnr/100
        double p, n, r;

        System.out.print("Enter P: ");
        Scanner sc = new Scanner(System.in);
        p = sc.nextDouble();

        System.out.print("Enter N: ");
        n = sc.nextDouble();

        System.out.print("Enter R: ");
        r = sc.nextDouble();

        double SI = (p*n*r)/100;
        System.out.println("Simple Interest: " + SI);
    }
}
