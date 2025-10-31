package piramide;

public class piramide {
    public static void main(String[] args) {
        int altura = 150;
        int digitos = 0;
        for (int aux = altura; aux > 0; aux = aux / 10) {
            digitos++;
        }
        System.out.println(digitos);

        for (int i = 0; i <= altura; i++) {
            for (int j = altura; j > i; j--) {
                for (int k = digitos; k > 0; k--) {
                    System.out.print(" ");
                }
            }
            for (int j = i; j >= 1; j--) {
                System.out.printf("%" + digitos + "d", j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.printf("%" + digitos + "d", j);
            }

            System.out.println();
        }
    }
}
