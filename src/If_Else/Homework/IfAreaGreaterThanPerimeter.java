package If_Else.Homework;

import java.util.Scanner;

public class IfAreaGreaterThanPerimeter {
    public static void main(String[] args) {
        System.out.print("Enter length: ");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        int area = l*b;
        int perimeter = 2*(l+b);
        if (area > perimeter){
            System.out.println("Area is greater than perimeter");
        } else {
            System.out.println("Perimeter is greater than area");
        }
    }
}
