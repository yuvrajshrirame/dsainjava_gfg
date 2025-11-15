package If_Else.Homework;

import java.util.Scanner;

public class MagnitudeLessThan69 {
    public static void main(String[] args) {
        // magnitude = absolute value = modulus
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0){
            num *= -1;
        }
        
        if (num < 69){
            System.out.println("Less magnitude");
            System.out.println(num);
        } else if (num == 69) {
            System.out.println("Same Magnitude");
        } else {
            System.out.println("More magnitude");
        }
    }
}
