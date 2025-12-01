package PatternPrinting.Homework;

import java.util.Scanner;

public class lowerAbcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int alpha = j + 96;
                System.out.print((char)alpha + " ");
            }
            System.out.println();
        }
    }
}
