package If_Else.Homework;

import java.util.Scanner;

public class LocationOfPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x in (x,y): ");
        int x = sc.nextInt();

        System.out.print("Enter value of y in (x,y): ");
        int y = sc.nextInt();

        if (x > 0 && y > 0){
            System.out.println("First quadrant");
        } else if (x < 0 && y > 0){
            System.out.println("Second quadrant");
        } else if (x < 0 && y < 0){
            System.out.println("Third quadrant");
        } else if (x > 0 && y < 0){
            System.out.println("Fourth quadrant");
        } else if (x == 0 && y == 0){
            System.out.println("Origin");
        } else if (x == 0) {
            System.out.println("Y-axis");
        } else {
            System.out.println("X-axis");
        }
    }
}
