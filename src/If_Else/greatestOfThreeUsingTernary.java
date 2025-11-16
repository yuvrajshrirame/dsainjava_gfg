package If_Else;

import java.util.Scanner;

public class greatestOfThreeUsingTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        System.out.print("Enter number 3: ");
        int c = sc.nextInt();

        System.out.print((a > b) ? ((a > c) ? 'a' : 'c') : ((b > c) ? 'b' : 'c'));
    }
}
