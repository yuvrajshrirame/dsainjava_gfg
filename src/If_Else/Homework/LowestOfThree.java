package If_Else.Homework;

import java.util.Scanner;

public class LowestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter number 2: ");
        int n2 = sc.nextInt();

        System.out.println("Enter number 3: ");
        int n3 = sc.nextInt();

        if (n1 < n2){ // n2 is not lowest
            if (n1 < n3){
                System.out.println("n1 is lowest");
            } else {
                System.out.println("n3 is lowest");
            }
        } else {
            if (n2 < n3){
                System.out.println("n2 is lowest");
            } else {
                System.out.println("n3 is lowest");
            }
        }
    }
}
