import java.util.Scanner;

class ParOuImpar {

    void Par(int f, int i) {
        int G = i;
        while (G <= f) {
            if (G % 2 == 0) {

                System.out.println("numero par: " + G);
            }
            G++;
        }

    }

    void Impar(int f, int i) {
        int G = i;
        while (G <= f) {
            if (G % 2 != 0) {

                System.out.println("numero impar: " + G);
            }
            G++;
        }
    }
}

class PosOuNeg {
    void Positivo(int f, int i) {
        int G = i;

        while (G < f) {
            if (G > 0) {

                System.out.println("numero positivo: " + G);
            }
            G++;
        }

    }

    void Negativo(int f, int i) {

        int G = i;

        while (G < f) {
            if (G < 0) {
                System.out.println("numero neagtivo: " + G);
            }
            G++;
        }
    }
}

public class ParesLoop {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int f, i;

        System.out.println("Digite o valor inicial da contagem (pode ser negativo): ");
        i = leitor.nextInt();

        System.out.println("Digite o valor final da contagem: ");
        f = leitor.nextInt();

        ParOuImpar Par = new ParOuImpar();
        ParOuImpar Impar = new ParOuImpar();
        PosOuNeg Positivo = new PosOuNeg();
        PosOuNeg Negativo = new PosOuNeg();

        Par.Par(f, i);
        Impar.Impar(f, i);
        Positivo.Positivo(f, i);
        Negativo.Negativo(f, i);

    }
}