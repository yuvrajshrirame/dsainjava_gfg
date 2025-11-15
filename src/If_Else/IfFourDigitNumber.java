package If_Else;

import java.util.Scanner;

public class IfFourDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num > 999 && num < 10000){
            System.out.println("Four digit");
        } else {
            System.out.println("Not four digit");
        }
    }
}
