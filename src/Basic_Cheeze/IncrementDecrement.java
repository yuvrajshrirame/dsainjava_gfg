package Basic_Cheeze;

public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);

        x = x + 2;
        System.out.println(x);

        x += 6;
        System.out.println(x);

        x *= 2;
        System.out.println(x);

        // increment, decrement operator

        x = 1;
        x++; // 1, post increment
        System.out.println(x);

        x = 1;
        ++x; // 2, pre increment
        System.out.println(x);

        x = 1;
        x--; // 1, post decrement
        System.out.println(x);

        x = 1;
        --x; // 0, pre decrement
        System.out.println(x);

        // VERY IMP
        int p = 1;
        int q = p++;
        System.out.println(p + " " + q); // 11 10
    }
}
