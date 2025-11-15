package If_Else;

import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args) {
        // logic: use type casting
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        if (num == (int)num){
            System.out.println("is an integer");
        } else {
            System.out.println("not an integer");
        }
    }
}
