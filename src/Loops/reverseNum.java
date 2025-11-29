package Loops;

public class reverseNum {
    public static void main(String[] args) {
        int n = 329;
        int rev = 0;
        while(n!=0){
            rev = rev * 10;
            rev += n%10;
            n/=10;
        }
        System.out.println(rev);
    }
}
