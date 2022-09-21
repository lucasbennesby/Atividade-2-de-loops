import java.util.Scanner;

public class divisao {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int divisor, dividendo, resto, resultado;

        System.out.println("Digite o dividendo: ");
        dividendo = leitor.nextInt();

        System.out.println("Digite o divisor: ");
        divisor = leitor.nextInt();

        resultado = dividendo / divisor;

        resto = dividendo % divisor;
        if (resultado != 0) {
            System.out.println(dividendo + "/" + divisor + " resulta em: " + resultado + " e sobra " + resto);
        } else {
            System.out.println("Divisao invalida");
        }

    }
}
/*
 * 3/2 = 1 e sobra 1
 * 4/2 = 2
 * 7/2 = 3 resto 1
 * 
 */
