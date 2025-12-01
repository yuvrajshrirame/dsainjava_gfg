package PatternPrinting;

import java.util.Scanner;

//public class numSquarePt2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num: ");
//        int n = sc.nextInt();
//        int num = 1;
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n; j++){
//                System.out.print(num);
//            }
//            num++;
//            System.out.println();
//        }
//    }
//}


public class numSquarePt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}