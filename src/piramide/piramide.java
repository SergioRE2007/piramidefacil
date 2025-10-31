package piramide;

public class piramide {
    public static void main(String[] args) {
        int altura = 6;



        for (int i = 0; i < altura; i++) {
            for (int j = altura; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
