package If_Else;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {

        System.out.print("Enter number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 0){
            num *= -1;
        }

        System.out.println(num);
    }
}
