package Loops;

import java.util.Scanner;

public class apowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int num = sc.nextInt();
        System.out.print("Enter b: ");
        int pw = sc.nextInt();

        int res = 1;
        for(int i = 1; i <= pw; i++){
            res *= num;
        }
        System.out.println(res);
    }
}
