package If_Else;

import java.util.Scanner;

public class SidesOfTriangle {
    public static void main(String[] args) {

        // logic: sum of any two sides of triangle are greater than 3rd one

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter side 2: ");
        int s2 = sc.nextInt();

        System.out.print("Enter side 3: ");
        int s3 = sc.nextInt();

        // you can use && operator and do it in one line as well
        if (s1 + s2 > s3){
            if (s2 + s3 > s1){
                if (s3 + s1 > s2){
                    System.out.println("is a triangle");
                } else System.out.println("not a triangle");
            } else System.out.println("not a triangle");
        } else System.out.println("not a triangle");
    }
}
