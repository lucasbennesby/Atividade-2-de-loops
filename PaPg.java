import java.util.Scanner;

public class PaPg {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int razao, n;

        System.out.println("Digite a razao da Pa e Pg: ");
        razao = leitor.nextInt();
        System.out.println("Digite a quantidade de elementos (N): ");
        n = leitor.nextInt();

        int[] Pa = new int[n];
        int[] Pg = new int[n];

        for (int i = 1; i < n; i++) {
            Pa[0] = razao;
            Pa[i] = (Pa[i - 1] + razao);
        }
        System.out.print("Pa: ");
        for (int i = 0; i < n; i++) {

            System.out.print(Pa[i] + ",");
        }

        System.out.println(" ");

        for (int i = 1; i < n; i++) {
            Pg[0] = razao;
            Pg[i] = (Pg[i - 1] * razao);
        }
        System.out.print("Pg: ");
        for (int i = 0; i < n; i++) {

            System.out.print(Pg[i] + ",");
        }

    }

}
