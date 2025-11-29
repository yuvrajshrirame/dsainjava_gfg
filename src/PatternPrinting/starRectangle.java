package PatternPrinting;

public class starRectangle {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){ // rows
            for(int j = 0; j < 5; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
