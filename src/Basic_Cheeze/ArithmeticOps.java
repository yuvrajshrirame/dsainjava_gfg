package Basic_Cheeze;

public class ArithmeticOps {
    public static void main(String[] args) {
        int e = 10;
        e = e + 20; // e += 20
        System.out.println(e);

        int f = 10;
        f = f - 20; // e -= 20
        System.out.println(f);

        // .
        // .
        // .
        // same goes for *, /, %, etc

        int x = 5, y = 2;
        System.out.println(x + y); // 7
        System.out.println(x - y); // 3
        System.out.println(x * y); // 10
        System.out.println(x / y); // 2 ; coz, datatype is int and not float, so it cuts it to 2 only (not round off)
        System.out.println(x % y); // 1

        double p = 5, q = 2;
        System.out.println(p/q);
    }
}
