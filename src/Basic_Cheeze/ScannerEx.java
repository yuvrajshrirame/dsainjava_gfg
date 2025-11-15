package Basic_Cheeze;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {

        System.out.print("Enter Number: ");

        Scanner sc = new Scanner(System.in);
        int enteredValue = sc.nextInt();

        System.out.println(enteredValue);
    }
}
