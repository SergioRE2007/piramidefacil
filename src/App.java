public class App {
    public static void main(String[] args) {
        System.out.println("Este programa muestra los n primeros números");
        System.out.print("Por favor, introduzca n: ");
        int numeros = Integer.parseInt(System.console().readLine());
        int i = 1;
        int a = 1;
        int b = 0;
        while (i <= numeros) {
            System.out.print(b + " ");
            int aux = a + b;
            a = b;
            b = aux;
            i++;
            System.out.println();
        }
    }
}
