package PatternPrinting;

import java.util.Scanner;

public class starRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter cols: ");
        int c = sc.nextInt();

        for(int i = 0; i < r; i++){ // rows (3)
            for(int j = 0; j < c; j++){ // cols (4)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}