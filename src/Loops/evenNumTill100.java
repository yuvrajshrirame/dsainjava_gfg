package Loops;

import java.util.Scanner;

public class evenNumTill100 {
    public static void main(String[] args) {
        // non-efficient way
        for(int i = 0; i <= 100; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        // this loop will break on 101


        // efficient way - table of 17
        for(int i = 17; i<=170; i+=17){
            System.out.print(i + " ");
        }
        // this loop will break on 187 (i.e. 170+17)
    }
}
