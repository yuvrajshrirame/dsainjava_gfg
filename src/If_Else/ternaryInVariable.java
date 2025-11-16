package If_Else;
import java.util.Scanner;

public class ternaryInVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int randvaPrasun = 0;

        if(n<=0){
            System.out.println("-ve prasun");
        } else {
            System.out.println("+ve prasun");
        }

        System.out.println(randvaPrasun);


        // OR -> using ternary

        int Prasun = (n <= 0 ) ? 0 : 100;
        System.out.println(Prasun);


    }
}
