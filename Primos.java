import java.util.Scanner;

public class Primos {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero, contador = 0;

        numero = leitor.nextInt();

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                contador++;
                break;
            }
        }
        if (contador == 0 && numero != 1) {
            System.out.println("O numero " + numero + " eh primo ");
        } else {
            System.out.println("O numero " + numero + " nao eh primo ");

        }
    }
}