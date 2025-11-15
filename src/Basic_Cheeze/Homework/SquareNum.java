package Basic_Cheeze.Homework;
import java.util.Scanner;

public class SquareNum {
    public static void main(String[] args) {

        System.out.print("Enter number: ");

        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        double sqr = n * n;
        System.out.println("Square: " + sqr);
    }
}
