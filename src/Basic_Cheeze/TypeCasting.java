package Basic_Cheeze;

public class TypeCasting {
    public static void main(String[] args) {

        // implicit type casting
        char ch = 'A';
        int x = ch;
        System.out.println(x);

        // explicit type casting

        char ch2 = 'a';
        int x2 = (char)ch2;
        System.out.println(x2);

        // IMP

        char p = 'a';
        System.out.println(p+0); // 97
        System.out.println(p*1); // 97
        System.out.println(p+p); // 194

        // integer to character

        int ab = 43;
        char cx = (char)ab; // explicit is necessary here
        System.out.println(cx); // +
    }
}
