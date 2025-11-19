package Loops.Homework;

import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++){
            System.out.println(i);
            System.out.println(n+1-i);
//            for (int j = n; j >= n-i; j--){
//                System.out.println(j);
//
//            }
        }
    }
}
