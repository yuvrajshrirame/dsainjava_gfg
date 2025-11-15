package Basic_Cheeze;

public class ModulusOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println(a % b); // remainder = 1

        // properties of modulus operator

        // 1. a % b = a (if a < b)
        // ex: 5 % 37 = 5

        // 2. a % (-b) = a % b
        // ex: 5 % (-2) = 5 % 2 = 1

        // 3. (-a) % b = -(a % b)
        // ex: (-5) % 2 = -(5 % 2) = -1
    }
}
