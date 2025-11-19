package Loops;

public class ascii {
    public static void main(String[] args) {
        // uppercase
        for (int i = 65; i <= 90; i++){
            System.out.println((char)i + " -> " + i);
        }
        System.out.println("---------------------------");

        // lowercase
        for(int x = 97; x <= 122; x++){
            System.out.println((char)x + " -> " + x);
        }
        System.out.println("---------------------------");

        // numbers
        for(int y = 48; y <= 57; y++){
            System.out.println((char)y + " -> " + y);
        }
    }
}
