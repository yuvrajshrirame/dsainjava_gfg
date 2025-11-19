package Loops;

import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int res = 0; // 0 means prime, 1 means not

        for (int i = 2; i <= n-1; i++){
            if(n % i == 0){
                res = 1;
                break;
            }
        }

        if(res == 1) System.out.println("composite");
        else System.out.println("prime");
    }
}
